package controller;

import javafx.animation.Animation;
import javafx.fxml.FXML;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class MainWindowController {
    private Main main;
    private Stage primaryStage;

    @FXML
    private Ellipse ellipse;

    public void initialize() {

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.seconds(4));

        translateTransition.setToY(300);
        translateTransition.setToX(150);
        translateTransition.setAutoReverse(true);
        translateTransition.setCycleCount(Animation.INDEFINITE);
        translateTransition.setNode(ellipse);
        translateTransition.play();
    }

    public void setMain(Main main, Stage primaryStage) {
        this.main = main;
        this.primaryStage = primaryStage;
    }
}
