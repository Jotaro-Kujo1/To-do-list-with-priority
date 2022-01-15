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

public class Main extends Application {

    ListShaping ls;

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) throws Exception{

        ls = new ListShaping();
        Parent root = FXMLLoader.load(getClass().getResource("shablon.fxml"));
        stage.setTitle(" Список дел ");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
