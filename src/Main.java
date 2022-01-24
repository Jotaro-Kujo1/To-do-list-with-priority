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

public class Main {

    public static void main(String[] args) {
        ListShaping ls = new ListShaping();
        List<Event> ev = ls.eventCreating();
        ev.forEach(System.out::println);
    }

}
