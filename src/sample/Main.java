package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("createNewGuestAccount.fxml"));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();



         }


    public static void main(String[] args) {
        launch(args);
    }
}
