
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JFXMain extends Application {
	static int i = 0;
	static boolean status = false;

	@Override
	public void init() throws Exception {
	}

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane border = new BorderPane();
		HBox hbox = new HBox();
		VBox vbox = new VBox();
		hbox.setPrefSize(320, 120);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(20);
		vbox.setPrefSize(320, 60);
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(20);

		border.setBottom(hbox);
		border.setTop(vbox);
		border.setPrefSize(320, 240);
		Label label = new Label(); // ��ü ����
		label.setText("������ ����");
		label.setFont(new Font(30));

		Label label2 = new Label();
		label2.setText("");
		label2.setFont(new Font(50));

		Button button = new Button(); // ��ü ����
		button.setText("��������");
		button.setAlignment(Pos.BOTTOM_LEFT);
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (status) {
					i += 10;
				} else
					i++;
				if (i % 100 == 0) {
					label.setText(i + "ȸ Ŭ�� !");
					label2.setText(i + "ȸ �޼� !");
				} else {
					label.setText(i + "ȸ Ŭ�� !");
				}
			}
		}); // ��ư ��ü�� �̺�Ʈ �ڵ鷯 ����.

		Button button2 = new Button();
		button2.setText("�ʱ�ȭ");
		button2.setAlignment(Pos.BOTTOM_CENTER);
		button2.setOnAction(event -> { // ���ٽ����� ����
			i = 0;
			label.setText("�ȴ�");
			label2.setText("");
		});

		CheckBox mode = new CheckBox();
		mode.setAlignment(Pos.BOTTOM_RIGHT);
		mode.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				status = mode.isSelected();
			}

		});

		vbox.getChildren().add(label); // VBox �� ��ü ����
		vbox.getChildren().add(label2);
		hbox.getChildren().add(button); // ��
		hbox.getChildren().add(button2);
		hbox.getChildren().add(mode);
		Scene scene = new Scene(border); // Scene ����

		primaryStage.setTitle("�׽�Ʈ");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
