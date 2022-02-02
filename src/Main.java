import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;

import java.util.List;

public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
        //ListShaping ls = new ListShaping();
        //List<Event> ev = ls.eventCreating();
        //ev.forEach(System.out::println);
    }

    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("shablon.fxml"));
        stage.setTitle("To - do list");
        stage.setScene(new Scene(root,400,400));
        stage.show();
    }
}
