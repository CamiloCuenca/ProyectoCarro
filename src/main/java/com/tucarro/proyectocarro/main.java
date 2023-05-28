package com.tucarro.proyectocarro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 700, 430);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> cancelButtonOnAction(stage));
    }

    public void cancelButtonOnAction(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("salir");
        alert.setHeaderText("Estas a punto de desconectarte");
        alert.setContentText("Estas seguro de desconectarte?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("saliste correctamente");
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
