import javafx.application.Application;
import javafx.stage.Stage;


public class Test144 extends Application {
  public Test144() {
    System.out.println("Test constructor is invoked");
  }

  @Override
  public void start(Stage primaryStage) {
    System.out.println("start method is invoked");
    primaryStage.show();
  }

  public static void main(String[] args) {
    System.out.println("launch application");
    Application.launch(args);
  }
}
