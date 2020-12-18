package boolegans.fhcampuswien.quiz.game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.awt.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    Button buttonA;

    public Controller(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void what(javafx.event.ActionEvent actionEvent) {
        System.out.print("Wut");
        buttonA.setStyle("-fx-background-color: green;");
    }
}
