package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class Controller  implements Initializable {

    @FXML
    Button add = new Button();

    @FXML
    Button show = new Button();

    @FXML
    TextField nameField = new TextField();

    @FXML
    TextField surnameField = new TextField();

    @FXML
    TextField PESELField = new TextField();

    @FXML
    TextField streetField = new TextField();

    @FXML
    TextField numberField = new TextField();

    @FXML
    TextField codeField = new TextField();

    @FXML
    ObservableList observableList;

    @FXML
    ComboBox cities = new ComboBox<>(observableList);

    @FXML
    public void addAccount() {

        String name = nameField.getText();
        String surname = surnameField.getText();
        String pesel = PESELField.getText();
        String street = streetField.getText();
        String number = numberField.getText();
        String code = codeField.getText();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
