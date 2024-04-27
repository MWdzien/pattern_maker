module org.example.pattern_maker {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pattern_maker to javafx.fxml;
    exports org.example.pattern_maker;
}