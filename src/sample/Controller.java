package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {


    public Label label;
    public ToggleGroup myGroup; // = new ToggleGroup();
    public Button button;
    public RadioButton button1;
    public RadioButton button2;
    public RadioButton button3;


    public void handleClick(ActionEvent actionEvent) {

        RadioButton selected = (RadioButton)myGroup.getSelectedToggle();
        String text = selected.getText();
        label.setText(text);
        
    }
}


