package sample.gui.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.be.Category;
import sample.gui.Model.CategoryModel;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private CategoryModel categoryModel;
    private ObservableList<Category> categoryObservableList;

    @FXML
    private TableView<Category> lstCat;
    @FXML
    private TableColumn<Category, String> catNameColumn;

    public MainController() throws IOException, SQLException {
        categoryModel = new CategoryModel();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        categoryObservableList = categoryModel.getCategories();

        lstCat.setItems(categoryObservableList);
        catNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    }
}
