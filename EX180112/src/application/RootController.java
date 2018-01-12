package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class RootController implements Initializable {
	@FXML private TextArea textArea;
	@FXML private Button btnSubmit;
	@FXML private Button btnClear;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnSubmit.setOnAction(event->Submit(event));
		btnClear.setOnAction(event->Clear(event));
	}
	public void Submit(ActionEvent e) {
		System.out.println("------\t\t[전송 시작]\t\t------");
		String intro = null;
		intro = textArea.getText();
		System.out.println(intro);
		System.out.println("------\t\t[전송 완료]\t\t------");
		textArea.setText("전송했습니다.");
	}
	public void Clear(ActionEvent e) {
		textArea.setText("다시 입력하세요.");
	}
}
