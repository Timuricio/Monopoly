import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


/**
 * Created by User on 07.10.2017.
 */
public class PanelPlayer extends BorderPane
{
    private Rectangle rectangle;
    private Color color;
    public PanelPlayer()
    {
        setPrefSize(300,100);
        setMaxSize(300,100);
        setLayoutX(5);
        setLayoutY(5);
        setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        color = new Color(1,1,1,0);

        rectangle = new Rectangle(60,60);

        rectangle.setFill(Color.WHITE);
        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                color = colorPicker.getValue();
                rectangle.setFill(color);
            }
        });

        TextField nameField = new TextField("???");
        nameField.setFont(new Font("Tahoma",26));
        nameField.setPrefWidth(300);

        setTop(colorPicker);
        setLeft(rectangle);
        setCenter(nameField);
    }
}
