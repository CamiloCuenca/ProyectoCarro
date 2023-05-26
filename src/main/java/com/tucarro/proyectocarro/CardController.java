package com.tucarro.proyectocarro;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import model.carro;

public class CardController {


    @FXML
    private Label authorName;

    @FXML
    private HBox box;

    @FXML
    private Label carroName;

    @FXML
    private ImageView Carroimage;

    private String[] colors = {"B9E5FF", "BDB2FE", "FB9AA8", "FF5056"};

    public void setData(carro carro) {

        // Image image = new Image(getClass().getResourceAsStream(carro.getImagenSrc()));   // no funciona
        //Carroimage.setImage(image);


        carroName.setText(carro.getName());
        authorName.setText(carro.getAuthor());
        box.setStyle("-fx-background-color: #" + (colors[(int) (Math.random() * colors.length)]));
        //  Image image = new Image(getClass().getResourceAsStream(carro.getImagenSrc()));
        //Carroimage.setImage(image);

    }
}
