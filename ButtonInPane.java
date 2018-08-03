import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;


public class ButtonInPane extends Application {
  @Override
  public void start(Stage primaryStage) {
    StackPane pane = new StackPane();
    Button b1 = new Button("Ok");
    Button b2 = new Button("Brr");
    pane.getChildren().add(b1);
    pane.getChildren().add(b2);
    Scene scene = new Scene(pane, 200, 50);
    primaryStage.setTitle("Button in a pane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
