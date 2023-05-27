module com.example.analisis_gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens FIGURAS_GEOMETRICAS to javafx.fxml;
    exports FIGURAS_GEOMETRICAS;
}