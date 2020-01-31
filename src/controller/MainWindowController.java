package controller;

import javafx.animation.Animation;
import javafx.fxml.FXML;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.animation.TranslateTransition;
import javafx.animation.PathTransition;
import javafx.util.Duration;

public class MainWindowController {
    private Main main;
    private Stage primaryStage;

    @FXML
    private Ellipse ellipse;
    @FXML
    private Path pathTail;
    @FXML
    private Path movementPath;

    public void initialize() {

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.seconds(4));

        translateTransition.setToX(20);
        translateTransition.setAutoReverse(true);
        translateTransition.setCycleCount(Animation.INDEFINITE);
        translateTransition.setNode(pathTail);
        translateTransition.play();

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.seconds(9));

        pathTransition.setPath(movementPath);

        pathTransition.setAutoReverse(true);
        pathTransition.setCycleCount(Animation.INDEFINITE);
        pathTransition.setNode(ellipse);
        pathTransition.play();
    }

    public void setMain(Main main, Stage primaryStage) {
        this.main = main;
        this.primaryStage = primaryStage;
    }
}
