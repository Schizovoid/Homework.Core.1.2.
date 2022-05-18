package Homework.JavaCore2.Homework4;

import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Application extends javafx.application.Application {
    public static void run(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/Chat.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
