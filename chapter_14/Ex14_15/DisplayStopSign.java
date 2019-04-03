import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DisplayStopSign extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        // creates scene and places it in the stage
        StopSign pane = new StopSign(200);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Stop Sign");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}