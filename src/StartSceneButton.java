import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

/**
 * Created by User on 07.10.2017.
 */
public class StartSceneButton extends Button
{
    public StartSceneButton(String text)
    {
        super(text);
        setPrefSize(300,95);
        setFont(new Font("Tahoma",36));
        //setStyle("-fx-base: red;");

    }
}
