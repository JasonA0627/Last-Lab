// Package declaration
package com.example.temp_converter2;
// Import JavaFX annotations and UI components
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
// Controller class for the temperature converter UI
public class ConverterController {
    // Injected reference to the Celsius input TextField from the FXML file
    @FXML private TextField celsiusInput;
    // Injected reference to the Fahrenheit output TextField from the FXML file
    @FXML private TextField fahrenheitOutput;
    // Listener that reacts to changes in the Celsius input field
    private CelsiusChangeListener celsiusListener;
    // Called automatically by JavaFX after FXML components are initialized
    public void initialize() {
        // Create a new change listener that will update fahrenheitOutput
        celsiusListener = new CelsiusChangeListener(fahrenheitOutput);
        // Attach the listener to the text property of the Celsius input field
        celsiusInput.textProperty().addListener(celsiusListener);
    }
}
