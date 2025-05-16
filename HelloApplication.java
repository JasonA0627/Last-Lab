package com.example.temp_converter2;
// JavaFX application framework imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
// Main application class that launches the JavaFX GUI
public class HelloApplication extends Application {
    // Called automatically when the application is launched
    @Override
    public void start(Stage stage) throws IOException {
        // Load the UI layout from the FXML file (hello-view.fxml)
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // Create a new scene using the loaded layout, with width 320 and height 240
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        // Set the title of the application window
        stage.setTitle("Hello!");
        // Set the scene for the stage (main window)
        stage.setScene(scene);
        // Display the window
        stage.show();
    }
    // Main method: entry point for the application
    public static void main(String[] args) {
        // Launch the JavaFX application, which calls start()
        launch();
    }
}
