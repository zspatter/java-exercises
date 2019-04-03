import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StopSign extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        // create red polygon
        StackPane pane = new StackPane();
        Polygon polygon = new Polygon();
        polygon.setFill(Color.RED);
        polygon.setRotate(22);
        polygon.setStroke(Color.WHITE);

        double centerX = 250;
        double centerY = 250;
        double radius = 225;

        ObservableList<Double> list = polygon.getPoints();

        for (int i = 0; i < 8; i++)
        {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
        }

        Text text = new Text("STOP");
        text.setFill(Color.WHITE);
        text.setFont(new Font("Comic Sans", 120));

        pane.getChildren().add(polygon);
        pane.getChildren().add(text);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
