import javafx.collections.ObservableList;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StopSign extends StackPane
{
    public StopSign(double size)
    {
        // creates a stop sign where the octagon and text portions
        // are relative to the parameter size
        Polygon background = buildOctagon(size);
        Text label = buildText(size);

        // adds the background and label to the StackPane
        getChildren().addAll(background, label);
    }

    private Polygon buildOctagon(double size)
    {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.rgb(204, 2, 2));
        ObservableList<Double> points = polygon.getPoints();

        double center = size / 2;

        // add points to polygon list
        for (int i = 0; i < 8; i++)
        {
            points.add(center + size * Math.cos(2 * i * Math.PI / 8));
            points.add(center - size * Math.sin(2 * i * Math.PI / 8));
        }

        // rotate octagon so it sits on a side rather than a point
        polygon.setRotate(45 / 2.0);
        return polygon;
    }

    private Text buildText(double size)
    {
        // creates text "STOP" and scales it relative to the size of the sign
        Text text = new Text("STOP");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Comic Sans", FontWeight.BOLD, size / 1.5));
        return text;
    }
}