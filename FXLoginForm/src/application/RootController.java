package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML
	TextField textID;
	@FXML
	TextField textPW;
	@FXML
	Button btnLogin;
	@FXML
	Button btnExit;
	@FXML
	CheckBox chkAnon;
	@FXML
	CheckBox chkPW;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnAction(event -> eventLogin(event));
		btnExit.setOnAction(event -> Platform.exit());
	}

	public void eventLogin(ActionEvent e) {
		String ID = textID.getText();
		String PW = textPW.getText();
		if (ID.isEmpty() || PW.isEmpty()) {
			System.out.printf("���̵�� �н����带 �Է��ϼ���.\n");
		} else {
			if (chkAnon.isSelected()) {
				ID = "Anonymous";
			}
			if (chkPW.isSelected()) {
				PW = "*********";
			}
			System.out.printf("���̵� : %s\n��й�ȣ : %s\n �α��� ����.\n", ID, PW);
		}
	}
}
