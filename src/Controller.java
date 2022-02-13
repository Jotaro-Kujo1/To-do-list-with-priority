import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button signInButton;

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button signUpButton;

    @FXML
    void initialize() {
        signInButton.setOnMouseEntered(event -> {
            signInButton.setStyle("-fx-background-color: #FF7F50;");
        });
        signInButton.setOnMouseExited(event -> signInButton.setStyle("-fx-background-color: #FF6347;"));
        signInButton.setOnAction(event -> {
            DataBaseHandler db = new DataBaseHandler();
            boolean lc = db.userLogIn(login.getText(), password.getText());
            if(lc) {
                signInButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("main_shablon.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            }else{
                System.out.println("fail");
            }
        });

        signUpButton.setOnMouseEntered(event -> {
            signUpButton.setStyle("-fx-background-color: #FF7F50;");
        });
        signUpButton.setOnMouseExited(event -> signUpButton.setStyle("-fx-background-color: #FF6347;"));
        signUpButton.setOnAction(event ->{
            signUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("registration_shablon.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        /*
        signInButton.setOnAction(event -> {
            ListShaping ls = new ListShaping();
            List<Event> ev = ls.eventCreating();
            ev.forEach(System.out::println);
        });
         */
    }

}
