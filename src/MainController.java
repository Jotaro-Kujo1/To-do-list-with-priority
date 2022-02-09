import java.net.URL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;

public class MainController {

    private ObservableList<Task> evv = FXCollections.observableArrayList();

    private List<Task> list;

    boolean infoCheck = false;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Task> infoTable;

    @FXML
    private TableColumn<Task, String> prepodColumn;

    @FXML
    private TableColumn<Task, String> workColumn;

    @FXML
    private TableColumn<Task, Integer> numsColumn;

    @FXML
    private TableColumn<Task, Integer> raitingColumn;

    @FXML
    private TextField textbox;

    @FXML
    private Button addButton;

    @FXML
    private Button closeButton;

    @FXML
    void initialize() {
        prepodColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("pr"));
        workColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("work"));
        numsColumn.setCellValueFactory(new PropertyValueFactory<Task, Integer>("nums"));
        raitingColumn.setCellValueFactory(new PropertyValueFactory<Task, Integer>("raiting"));



        DataBaseHandler datb = new DataBaseHandler();
        try{
            list = datb.readResultSet();
            for (Task i:list
            ) {
                evv.add(i);
            }
            infoTable.setItems(evv);
            infoCheck = true;
        }catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }


        addButton.setOnAction(event -> {
            if(infoCheck){
                String tmp = "";
                for (Task i:list
                     ) {
                    tmp+=i.toString();
                }
                tmp += textbox.getText();
                System.out.println(tmp);
                ListShaping ls = new ListShaping(new Treatment(tmp));
                List<Task> ev = ls.eventCreating();
                evv.clear();
                for (Task i : ev
                ) {
                    evv.add(i);
                }
                infoTable.setItems(evv);

            }else {
                ListShaping ls = new ListShaping(new Treatment(textbox.getText()));
                List<Task> ev = ls.eventCreating();
                for (Task i : ev
                ) {
                    evv.add(i);
                }
                //evv.addAll(ev);
                infoTable.setItems(evv);

                //ev.forEach(System.out::println);
            }
        });

        closeButton.setOnAction(event -> {
            pushAfterClose();
        });
    }
    private void pushAfterClose(){
        DataBaseHandler db = new DataBaseHandler();
        db.clearTable();
        db.addPrepod(evv);
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}

