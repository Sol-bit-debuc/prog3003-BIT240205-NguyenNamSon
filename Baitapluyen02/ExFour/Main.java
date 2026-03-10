package ExFour;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label lblTitle = new Label("Chuyển đổi Celsius → Fahrenheit");
        TextField txtCelsius = new TextField();
        txtCelsius.setPromptText("Nhập độ C");
        Button btnConvert = new Button("Chuyển đổi");
        Label lblResult = new Label("Kết quả:");
        btnConvert.setOnAction(e -> {
            try {
                double C = Double.parseDouble(txtCelsius.getText());
                double F = C * 9 / 5 + 32;
                lblResult.setText("Fahrenheit: " + F + " °F");
            } catch (Exception ex) {
                lblResult.setText("Vui lòng nhập số!");
            }
        });
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(lblTitle, txtCelsius, btnConvert, lblResult);
        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Temperature Converter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
