package ExFour;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    private TextField display = new TextField();
    private double num1 = 0, num2 = 0;
    private char operator;

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        display.setEditable(false);
        grid.add(display, 0, 0, 4, 1);

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        int row = 1, col = 0;
        for (String text : buttons) {
            Button btn = new Button(text);
            btn.setMinSize(50, 50);
            btn.setOnAction(e -> handleButton(text));
            grid.add(btn, col, row);
            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }

        stage.setScene(new Scene(grid, 220, 250));
        stage.setTitle("JavaFX Calculator");
        stage.show();
    }

    private void handleButton(String text) {
        if (text.matches("[0-9]")) {
            display.appendText(text);
        } else if (text.equals("C")) {
            display.clear();
        } else if (text.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
        } else {
            num1 = Double.parseDouble(display.getText());
            operator = text.charAt(0);
            display.clear();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
