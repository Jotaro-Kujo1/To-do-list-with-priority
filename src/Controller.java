import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
        signInButton.setOnAction(event -> {
            ListShaping ls = new ListShaping();
            List<Event> ev = ls.eventCreating();
            ev.forEach(System.out::println);
        });

    }
}
