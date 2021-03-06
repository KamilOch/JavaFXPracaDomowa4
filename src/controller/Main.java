package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        mainWindow();
    }

    public void mainWindow() {
        try {
            FXMLLoader loader = new
                    FXMLLoader(Main.class.getResource("/view/MainWindowView.fxml"));

            primaryStage.setTitle("Praca domowa nr. 4");

            StackPane pane = loader.load();

            Scene scene = new Scene(pane);

            MainWindowController mainWindowController =
                    loader.getController();

            mainWindowController.setMain(this, primaryStage);
            primaryStage.setMinWidth(1000);
            primaryStage.setMinHeight(600);

            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
