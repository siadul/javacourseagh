package exam;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;

public class Controller {
    final double PANE_WIDTH = 500;
    final double PANE_HEIGHT = 500;
    final double BTN_X = 20;
    final double BTN_Y = 460;
    final double BTN_WIDTH = 100;
    final double BTN_HEIGHT = 25;
    final double MAX_WIDTH = PANE_WIDTH-BTN_WIDTH-BTN_X;
    final double MAX_HEIGHT = -BTN_Y;

    public Slider slv;
    public Slider slh;
    public Button bt1;

    @FXML
    public void initialize() {
        slh.valueProperty().addListener((observable, oldValue, newValue) -> {
            double x = MAX_WIDTH*newValue.doubleValue()/100;
            bt1.setTranslateX(x);
            bt1.setText(String.format("%.1f %.1f", newValue.doubleValue(), slv.getValue()));
        });
        slv.valueProperty().addListener((observable, oldValue, newValue) -> {
            double y = MAX_HEIGHT*newValue.doubleValue()/100;
            bt1.setTranslateY(y);
            bt1.setText(String.format("%.1f %.1f", slh.getValue(), newValue.doubleValue()));
        });

    }

}
