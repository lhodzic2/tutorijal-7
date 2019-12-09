package ba.unsa.etf.rpr.tutorijal07;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ListView<?> Lista;

    @FXML
    private Label imeL;

    @FXML
    private Label prezimeL;

    @FXML
    private Label mailL;

    @FXML
    private Label korisnickoL;

    @FXML
    private Label lozinkaL;

    @FXML
    private Button dodajBtn;

    @FXML
    private Button krajBtn;

    @FXML
    public void closeButtonAction() {
        Stage stage = (Stage) krajBtn.getScene().getWindow();
        stage.close();
    }
}