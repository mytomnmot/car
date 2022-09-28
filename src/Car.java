import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Car extends Application {
   @Override
   public void start(Stage stage) throws Exception {
      // loads Car.fxml 
      Parent root = 
         FXMLLoader.load(getClass().getResource("Car.fxml"));

      Scene scene = new Scene(root); // attach scene graph to scene
      stage.setTitle("小汽车"); // displayed in window's title bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
   }

   public static void main(String[] args) {
      launch(args); // create a object and call its start method
   }
}
