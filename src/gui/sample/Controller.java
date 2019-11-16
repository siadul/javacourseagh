package gui.sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

import java.io.*;
import java.util.Scanner;

public class Controller {
    public Label lb1;
    public Button bt3;
    public Button bt4;
    public Slider slider1;
    public Circle c1;

    @FXML
    public void initialize() {
        // instrukje wykonynywane po inicjalizji kontroler
        slider1.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    c1.setTranslateX(newValue.doubleValue());
                }
        );
    }

    public void bt2Clicked(MouseEvent mouseEvent) {
        // zapisywanie do pliku

        // PrintWriter
        try {
            PrintWriter out = new PrintWriter("text1.txt");
            out.println("Raz");
            out.println("Dwa");
            out.println("Trzy");
            out.print("Cztery");
            out.print("Pięć");
            out.close();
            lb1.setText("Plik text1.txt został zapisany.");
        } catch (FileNotFoundException e) {
            lb1.setText("Nieprawidłowa ścieżka!!!");
        }


    }

    public void bt3Clicked(ActionEvent actionEvent) {
        try {
            FileWriter fileWriter = new FileWriter("text1.txt", true);
            PrintWriter out = new PrintWriter(fileWriter);
            out.println("Dopisujemy");
            out.println("Coś");
            out.close();
            lb1.setText("Dopisano do pliku text1.txt.");
        } catch (IOException e) {
            lb1.setText("Nieprawidłowa ścieżka!!!");
        }
    }

    public void bt4Action(ActionEvent actionEvent) {
        File path = new File("text1.txt");
        try {
            Scanner scanner = new Scanner(path);
            String text = "";
            while(scanner.hasNextLine()) {
                text += scanner.nextLine() + "\n";
            }
            lb1.setText(text);
            scanner.close();
        } catch (FileNotFoundException e) {
            lb1.setText("Nieprawidłowa ścieżka!!!");
        }
    }


}
