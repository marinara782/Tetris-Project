module ca.ucalgary.cpsc219.finalprojectp2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens ca.ucalgary.cpsc219.finalprojectp2 to javafx.fxml;
    exports ca.ucalgary.cpsc219.finalprojectp2;
}