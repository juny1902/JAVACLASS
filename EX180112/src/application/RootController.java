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
		System.out.println("------\t\t[���� ����]\t\t------");
		String intro = null;
		intro = textArea.getText();
		System.out.println(intro);
		System.out.println("------\t\t[���� �Ϸ�]\t\t------");
		textArea.setText("�����߽��ϴ�.");
	}
	public void Clear(ActionEvent e) {
		textArea.setText("�ٽ� �Է��ϼ���.");
	}
}
