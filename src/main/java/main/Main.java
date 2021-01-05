package main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.gaze.devicemanager.TobiiGazeDeviceManager;

public class Main extends Application {

    TobiiGazeDeviceManager tgdm;

    @Override
    public void start(Stage primaryStage) {
        Configuration configuration = new Configuration();
        this.tgdm = new TobiiGazeDeviceManager();
        tgdm.init(configuration);
    }

    public static void main(String[] args) {
        launch(args);
    }

}