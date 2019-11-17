package exam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Zadanie3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent Klawisz =
                FXMLLoader.load(getClass()
                        .getResource("klawisz.fxml"));
        primaryStage.setTitle("Klawisz");
        primaryStage.setScene(new Scene(Klawisz, 700, 700));
        primaryStage.show();
    }
}
