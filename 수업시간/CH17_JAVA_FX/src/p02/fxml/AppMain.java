package p02.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		//Container 설정(Parent)
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene s = new Scene(root);
		stage.setTitle("로그인");
		stage.setScene(s);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
