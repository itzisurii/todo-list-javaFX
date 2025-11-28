package controller;

import com.jfoenix.controls.JFXCheckBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DashboardFormController {

    @FXML
    private JFXCheckBox checkTask;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private DatePicker date;

    @FXML
    private TableView<?> tblCompletedTasks;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtTitle;

    @FXML
    void addTaskOnAction(ActionEvent event) {

    }

    @FXML
    void reloadOnAction(ActionEvent event) {

    }

}
