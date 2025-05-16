// Package declaration
package com.example.temp_converter2;
// JavaFX imports for listening to changes and working with text fields
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
// Class that listens for changes in a Celsius TextField and updates Fahrenheit output
public class CelsiusChangeListener implements ChangeListener<String> {
    // Reference to the TextField that will display the Fahrenheit result
    private final TextField fahrenheitOutput;
    // Flag to enable or disable the change listener temporarily
    private boolean enabled = true;
    // Constructor: Initializes the listener with the associated Fahrenheit TextField
    public CelsiusChangeListener(TextField fahrenheitOutput) {
        this.fahrenheitOutput = fahrenheitOutput;
    }
    // Allows enabling or disabling the listener externally
    public void setEnabled(boolean value) {
        enabled = value;
    }
    // This method is called automatically when the text in the observed TextField changes
    @Override
    public void changed(ObservableValue<? extends String> obs, String oldVal, String newVal) {
        // Do nothing if the listener is disabled
        if (!enabled) return;
        try {
            // If the input is null or empty, clear the output
            if (newVal == null || newVal.trim().isEmpty()) {
                fahrenheitOutput.setText("");
                return;
            }
            // Try to parse the Celsius value from input
            double celsius = Double.parseDouble(newVal);
            // Convert to Fahrenheit using the formula: F = C * 9/5 + 32
            double fahrenheit = (celsius * 9 / 5) + 32;
            // Format and display the Fahrenheit result in the output field
            fahrenheitOutput.setText(String.format("%.2f", fahrenheit));
        } catch (NumberFormatException e) {
            // If parsing fails, display an error message
            fahrenheitOutput.setText("Invalid input");
        }
    }
}
