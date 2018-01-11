import javafx.application.*;
import javafx.stage.*;

public class JFXMain extends Application {
	public void initStage(Stage primaryStage) {
		primaryStage.setWidth(320);
		primaryStage.setHeight(240);
		primaryStage.setResizable(false);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		initStage(primaryStage);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
