package es.ieslosmontecillos.expresioneslambdamouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)
    {
        //Creamos un pane que no tendra ningun tipo de ajuste para poder mover el texto libremente
        Pane root = new Pane();

        //Creamos el texto, lo configuramos y añadimos al pane
        Text text = new Text(0, 10,"Hello World!");
        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        });

        root.getChildren().add(text);

        //Creamos la escena y la mostramos
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Lambda mouse event");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}