package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by User on 07.10.2017.
 */
public class View extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Monopoly");
        loadStartScene(primaryStage);
    }

    private void loadStartScene(Stage stage)
    {
        VBox pane = new VBox(20);

        Button startButton= new StartSceneButton("Start");
        Button saveButton = new StartSceneButton("Save");
        saveButton.setDisable(true);
        Button loadButton = new StartSceneButton("Load");
        Button optionsButton = new StartSceneButton("Options");
        Button exitButton = new StartSceneButton("Exit");

        startButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                newGameScene(stage);
            }
        });

        exitButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                System.exit(0);
            }
        });

        pane.getChildren().addAll(startButton,saveButton,loadButton,optionsButton,exitButton);

        pane.setAlignment(Pos.CENTER);

        Scene startScene = new Scene(pane,1200,800);

        stage.setScene(startScene);
        stage.show();
    }

    private void newGameScene (Stage stage)
    {
        VBox pane = new VBox(10);

        Button addButton = new StartSceneButton("Add player");

        addButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                pane.getChildren().remove(addButton);
                pane.getChildren().addAll(new PanelPlayer(),addButton);
            }
        });

        pane.getChildren().addAll(addButton);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane,1200,800);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
