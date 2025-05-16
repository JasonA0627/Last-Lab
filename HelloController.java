package com.example.temp_converter2;
// Import JavaFX components used in the controller
import javafx.fxml.FXML;
import javafx.scene.control.Label;
// Controller class for handling UI logic defined in the FXML file
public class HelloController {
    // Reference to the Label in the FXML file, injected by JavaFX
    @FXML
    private Label welcomeText;
    // Method called when the "Hello" button is clicked (linked via FXML)
    @FXML
    protected void onHelloButtonClick() {
        // Set the welcome message when the button is pressed
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
