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
			System.out.printf("아이디와 패스워드를 입력하세요.\n");
		} else {
			if (chkAnon.isSelected()) {
				ID = "Anonymous";
			}
			if (chkPW.isSelected()) {
				PW = "*********";
			}
			System.out.printf("아이디 : %s\n비밀번호 : %s\n 로그인 성공.\n", ID, PW);
		}
	}
}
