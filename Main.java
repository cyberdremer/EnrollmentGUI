package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application  {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Parent parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("University Enrollment");
        window.setScene(new Scene(parent, 600, 400));
        window.show();
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        window.show();


    }


    private void closeProgram(){
        boolean answer = ConfirmAppShutdown.display("Title", "Are you sure you want to exit?");
        if(answer){
            window.close();
        }




    }






    

}
