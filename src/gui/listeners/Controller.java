package gui.listeners;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Controller {

    public Rectangle r1;
    public Circle c1;
    public ProgressBar pb1;
    public Spinner sp1;
    public Spinner sp2;

    @FXML
    public void initialize() {
        sp1.getEditor().textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                double d = Double.parseDouble(newValue);
                r1.setRotate(d);
                pb1.setProgress(d/360);
            } catch (NumberFormatException e) {
                System.out.println("Nie udało się sparsować wartości spinnera");
            }
        });

        sp2.getEditor().textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                double d = Double.parseDouble(newValue);
                r1.setTranslateX(d);
                c1.setTranslateX(-d);
            } catch (NumberFormatException e) {
                System.out.println("Nie udało się sparsować wartości spinnera");
            }
        });

        // Zadanie
        //

    }
}
