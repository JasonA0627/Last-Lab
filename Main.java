package com.example.temp_converter2;
// JavaFX core classes for application setup and UI rendering
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
// Main class that launches the Temperature Converter application
public class Main extends Application {
    // Called automatically when the application starts
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML layout file for the temperature converter interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource("temp_converter.fxml"));
        // Create a scene using the loaded layout with specified width and height
        Scene scene = new Scene(loader.load(), 300, 200);
        // Set the title of the application window
        stage.setTitle("Temp Converter");
        // Assign the scene to the stage (application window)
        stage.setScene(scene);
        // Display the stage
        stage.show();
    }
    // Entry point for the Java application
    public static void main(String[] args) {
        // Launch the JavaFX application, triggering the start() method
        launch();
    }
}
