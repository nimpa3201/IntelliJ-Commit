module com.likelion.javaproject4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.likelion.javaproject4 to javafx.fxml;
    exports com.likelion.javaproject4;
}