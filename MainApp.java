import com.google.gson.Gson;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

   /**
   Description:
   The main class that launches the JavaFX application for managing artist information.
   */
   
public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /**
    * Start method called when the application is launched.
    *
    * @param primaryStage: The primary stage for the application, onto which the application scene can be set.
    * @throws Exception: If there are issues during application startup.
    */
     
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Artist Index.fxml"));
        Parent root = loader.load();

        ArtistController controller = loader.getController();
        
        final String[] userInputArtistName = {""};
        
        controller.getSearchButton().setOnAction(event ->
        {
            userInputArtistName[0] = controller.getArtistSearch().getText(); // Get text that the user entered from the text field.
            userInputArtistName[0] = userInputArtistName[0].trim().toLowerCase(); // Remove all trailing and leading spaces, as well as sonverting to lowercase.
            userInputArtistName[0] = userInputArtistName[0].replace(" ", "%20"); // Replace all spaces in the search itself with the characters %20 so that the API can search properly.
            
            try
            {
               // System.out.println("Artist Name: " + artistName[0]);
               
               // First API call to search for artists.
               String musicBrainzArtistURL = "https://musicbrainz.org/ws/2/artist/?query=" + userInputArtistName[0] + "&fmt=json&limit=1";
               
               // System.out.println(musicBrainzArtistURL);
               
               URL urlOne = new URL(musicBrainzArtistURL);
               Scanner firstAPICall = new Scanner(urlOne.openStream());
               String jsonDataArtists = firstAPICall.nextLine();
            
               // System.out.println("JSON: " + jsonDataArtists);
               
               Gson gson = new Gson();
               
               SearchResult artistSearch = gson.fromJson(jsonDataArtists, SearchResult.class);
               Artist[] artist = artistSearch.getArtist();
               
               String artistName = artist[0].getArtistName();      
               String dateOfBirth = artist[0].getLifeSpan().getDateOfBirth();
               String artistCountry = artist[0].getCountry();
               String artistGender = artist[0].getGender();
               String artistGenre = artist[0].getGenre();
               
               // Second API call to search for the artist's first release based off their MusicBrainz ID.
               String musicBrainzReleasesURL = "https://musicbrainz.org/ws/2/release/?artist=" + artist[0].getArtistID() + "&fmt=json&limit=1";
            
               // System.out.println(musicBrainzReleasesURL);
            
               URL urlTwo = new URL(musicBrainzReleasesURL);
               Scanner secondAPICall = new Scanner(urlTwo.openStream());
               String jsonDataReleases = secondAPICall.nextLine();
               
               // System.out.println("JSON: " + jsonDataReleases);
               
               SearchResult releaseSearch = gson.fromJson(jsonDataReleases, SearchResult.class);
               Release[] release = releaseSearch.getRelease();
               
               String firstRelease = release[0].getReleaseTitle();
               
               try
               {
                  SimpleDateFormat originalDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                  SimpleDateFormat newDateFormat = new SimpleDateFormat("MM-dd-yyyy");
                  String formattedDateOfBirth = newDateFormat.format(originalDateFormat.parse(dateOfBirth));
                  
                  controller.updateArtistName("Artist Name: " + artistName);
                  controller.updateDateOfBirth("Date of Birth: " + formattedDateOfBirth);
                  controller.updateCountry("Country: " + artistCountry);
                  controller.updateGender("Gender: " + artistGender);
                  controller.updateGenre("Genre: " + artistGenre);
                  controller.updateFirstRelease("First Release: " + firstRelease);
               }
               catch (ParseException e)
               {
                  e.printStackTrace();
                  controller.getArtistSearch().setText("Error - please try again");
               }
            }
            catch (MalformedURLException e)
            {
               e.printStackTrace();
            }
            catch (IOException e)
            {
               e.printStackTrace();
            }
            catch (ArrayIndexOutOfBoundsException | NullPointerException e)
            {
               e.printStackTrace();
               controller.getArtistSearch().setText("Error - please try again");
            }
        });
        
        Scene scene = new Scene(root, 340, 780);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Artist Search");
        primaryStage.show();
    }
}