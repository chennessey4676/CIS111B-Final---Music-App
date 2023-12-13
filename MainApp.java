import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        
        controller.updateArtistName("Boy Pablo");
        
        Scene scene = new Scene(root, 340, 780);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Artist Search");
        primaryStage.show();
    }
}