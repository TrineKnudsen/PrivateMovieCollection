package sample.gui.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.gui.Model.MovieModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddMovieController implements Initializable {
    private MovieModel MovieModel;


    @FXML
    private TextField addMovieName;
    @FXML
    private TextField addYear;
    @FXML
    private TextField addDuration;
    @FXML
    private TextField addRating;
    @FXML
    private TextField addPath;
    @FXML
    private Button addNewMovie;


    public AddMovieController() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            this.MovieModel = new MovieModel();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}