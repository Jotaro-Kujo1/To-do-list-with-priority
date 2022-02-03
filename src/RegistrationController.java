import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginReg;

    @FXML
    private TextField passwordReg;

    @FXML
    private Button signUpButtonReg;

    @FXML
    void initialize() {
        signUpButtonReg.setOnAction(event -> {
            DataBaseHandler db = new DataBaseHandler();
            db.userRegistration(loginReg.getText(),passwordReg.getText());

            signUpButtonReg.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("shablon.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

            //Тут добавить считывание с текстбоксов и пуш в БД
        });

    }
}

