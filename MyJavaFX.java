import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MyJavaFX extends Application {
  @Override
  public void start(Stage primaryStage) {
    Button btOk = new Button("OK");
    Scene scene = new Scene(btOk, 200, 500);
    primaryStage.setTitle("MyJavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}
