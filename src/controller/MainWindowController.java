package controller;

import javafx.animation.Animation;
import javafx.fxml.FXML;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
//import javafx.animation.TranslateTransition;
import javafx.animation.PathTransition;
import javafx.util.Duration;

public class MainWindowController {
    private Main main;
    private Stage primaryStage;

    @FXML
    private Ellipse ellipse;
    @FXML
    private Path path;

    public void initialize() {

//        TranslateTransition translateTransition = new TranslateTransition();
//        translateTransition.setDuration(Duration.seconds(4));
//
//        translateTransition.setToY(300);
//        translateTransition.setToX(150);
//        translateTransition.setAutoReverse(true);
//        translateTransition.setCycleCount(Animation.INDEFINITE);
//        translateTransition.setNode(ellipse);
//        translateTransition.play();

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.seconds(9));

        pathTransition.setPath(path);

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
