package boolegans.fhcampuswien.quiz.game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.awt.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Label question, answerA, answerB, answerC, answerD;
    @FXML
    private Button buttonA, buttonB, buttonC, buttonD;

    public Controller(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void buttonAaction(javafx.event.ActionEvent actionEvent) {
        System.out.print("Wut");
        buttonA.setStyle("-fx-background-color: green;");
    }

    @FXML
    public void buttonBaction(javafx.event.ActionEvent actionEvent) {
        System.out.print("Wut");
        buttonB.setStyle("-fx-background-color: red;");
    }

    @FXML
    public void buttonCaction(javafx.event.ActionEvent actionEvent) {
        System.out.print("Wut");
        buttonC.setStyle("-fx-background-color: blue;");
    }

    @FXML
    public void buttonDaction(javafx.event.ActionEvent actionEvent) {
        System.out.print("Wut");
        buttonD.setStyle("-fx-background-color: pink;");
    }
}
