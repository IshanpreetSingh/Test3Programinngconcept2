module com.example.test3ishanpreetsingh {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.test3ishanpreetsingh to javafx.fxml;
    exports com.example.test3ishanpreetsingh;
}