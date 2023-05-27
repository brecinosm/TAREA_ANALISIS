package FIGURAS_GEOMETRICAS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Menu.class.getResource("GUI_PROPIEDADES.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 775, 255);
        stage.setTitle("Tarea_Analisis");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }



}