package com.tucarro.proyectocarro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
    @Override
    public void start(Stage stage) throws  Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(),700,450);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
