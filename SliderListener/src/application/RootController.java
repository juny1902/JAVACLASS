package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

public class RootController implements Initializable {

	@FXML
	private Label Label1;
	@FXML
	private Slider Slider1;
	@FXML
	private TextArea Text1;
	@FXML
	private TextArea Text2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Bindings.bindBidirectional(Text1.textProperty(), Text2.textProperty());
		Bindings.bindBidirectional(Text1.fontProperty(), Text2.fontProperty());
		Slider1.valueProperty().addListener(new ChangeListener<Number>() {
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				Label1.setText(String.format("ÇöÀç °ª : %f", newValue.doubleValue()));
				Text1.setFont(new Font((newValue.doubleValue()/2)+12));
			}
		});

	}

}
