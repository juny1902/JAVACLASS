import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class calc_body implements Initializable {
	private static String entry = null;
	private static int status = 0;
	private static long from = 0;
	private static long to = 0;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private Button btn4;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btn0;
	@FXML
	private Button btn_sign;
	@FXML
	private Button btn_equal;
	@FXML
	private Button btn_plus;
	@FXML
	private Button btn_minus;
	@FXML
	private Button btn_divide;
	@FXML
	private Button btn_prod;
	@FXML
	private TextField text_result;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(event->entryNum1(event));
		btn2.setOnAction(event->entryNum2(event));
		btn3.setOnAction(event->entryNum3(event));
		btn4.setOnAction(event->entryNum4(event));
		btn5.setOnAction(event->entryNum5(event));
		btn6.setOnAction(event->entryNum6(event));
		btn7.setOnAction(event->entryNum7(event));
		btn8.setOnAction(event->entryNum8(event));
		btn9.setOnAction(event->entryNum9(event));
		btn0.setOnAction(event->entryNum0(event));
		
	}

	public void entryNum1(ActionEvent event) {
		entry += "1";
		text_result.setText(entry);
		
	}

	public void entryNum2(ActionEvent event) {
		entry += "2";
		text_result.setText(entry);
	}

	public void entryNum3(ActionEvent event) {
		entry += "3";
		text_result.setText(entry);
	}

	public void entryNum4(ActionEvent event) {
		entry += "4";
		text_result.setText(entry);
	}

	public void entryNum5(ActionEvent event) {
		entry += "5";
		text_result.setText(entry);
	}

	public void entryNum6(ActionEvent event) {
		entry += "6";
		text_result.setText(entry);
	}

	public void entryNum7(ActionEvent event) {
		entry += "7";
		text_result.setText(entry);
	}

	public void entryNum8(ActionEvent event) {
		entry += "8";
		text_result.setText(entry);
	}

	public void entryNum9(ActionEvent event) {
		entry += "9";
		text_result.setText(entry);
	}

	public void entryNum0(ActionEvent event) {
		entry += "0";
		text_result.setText(entry);
	}

	public void Plus(ActionEvent event) {
		if (!entry.isEmpty()) {
			from = Long.parseLong(entry);
			entry = null;
			text_result.setText(entry);
			status = 1;
		}

	}

	public void Minus(ActionEvent event) {
		if (!entry.isEmpty()) {
			from = Long.parseLong(entry);
			entry = null;
			text_result.setText(entry);
			status = 2;
		}

	}

	public void Prod(ActionEvent event) {
		if (!entry.isEmpty()) {
			from = Long.parseLong(entry);
			entry = null;
			text_result.setText(entry);
			status = 3;
		}

	}

	public void Divide(ActionEvent event) {
		if (!entry.isEmpty()) {
			from = Long.parseLong(entry);
			entry = null;
			text_result.setText(entry);
			status = 4;
		}
	}

	public void Equal(ActionEvent event) {
		if (!entry.isEmpty()) {
			to = Long.parseLong(entry);
			long tmp_result = 0;
			switch (status) {
			case 1:
				tmp_result = from + to;
				entry = Long.toString(tmp_result);
				text_result.setText(entry);
				from = tmp_result;
				break;
			case 2:
				tmp_result = from - to;
				entry = Long.toString(tmp_result);
				text_result.setText(entry);
				from = tmp_result;
				break;
			case 3:
				tmp_result = from * to;
				entry = Long.toString(tmp_result);
				text_result.setText(entry);
				from = tmp_result;
				break;
			case 4:
				tmp_result = from / to;
				entry = Long.toString(tmp_result);
				text_result.setText(entry);
				from = tmp_result;
				break;
			}
			status = 0;
		}
	}

}
