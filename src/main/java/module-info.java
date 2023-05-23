module com.tucarro.proyectocarro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tucarro.proyectocarro to javafx.fxml;
    exports com.tucarro.proyectocarro;
    exports model;
    opens model to javafx.fxml;
}