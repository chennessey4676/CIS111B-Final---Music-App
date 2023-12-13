import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

/**
   Controller class for managing artist information in the UI.
*/
public class ArtistController implements Initializable {

    @FXML
    private Label artistNameLabel;
    
    @FXML
    private Label dateOfBirthLabel; 

    @FXML
    private Label genderLabel;

    @FXML
    private Label countryLabel;

    @FXML
    private Label genreLabel;

    @FXML
    private Label firstReleaseLabel;

    @FXML
    private TextField artistSearch; 

    @FXML
    private Button searchButton; 

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    /**
    * Updates the artist name label with the provided name.
    *
    * @param artistName: The name of the artist to be displayed.
    */

    public void updateArtistName(String artistName) {
        artistNameLabel.setText(artistName);
    }
    
    /**
    * Updates the date of birth label with the provided date.
    *
    * @param dateOfBirth: The date of birth information to be displayed.
    */
    
    public void updateDateOfBirth(String dateOfBirth) {
        dateOfBirthLabel.setText(dateOfBirth);
    }
    
    /**
    * Updates the gender label with the provided gender information.
    *
    * @param gender: The gender information to be displayed.
    */
    
    public void updateGender(String gender) {
        genderLabel.setText(gender);
    }

    /**
    * Updates the country label with the provided country information.
    *
    * @param country: The country information to be displayed.
    */
     
    public void updateCountry(String country) {
        countryLabel.setText(country);
    }

    /**
    * Updates the genre label with the provided genre information.
    *
    * @param genre: The genre information to be displayed.
    */
     
    public void updateGenre(String genre) {
        genreLabel.setText(genre);
    }

    /**
    * Updates the first release label with the provided information.
    *
    * @param firstRelease: The first release information to be displayed.
    */
    
    public void updateFirstRelease(String firstRelease) {
        firstReleaseLabel.setText(firstRelease);
    }
    
    /**
      An accessor method that gets the search button from the GUI.
      
      @return The search button from the GUI.
   */
    public Button getSearchButton()
    {
      return searchButton;
    }
    
    /**
      An accessor method that gets the text entered by the user from the text field.
      
      @return The text entered by the user from the text field.
   */
    public TextField getArtistSearch()
    {
      return artistSearch;
    }
}