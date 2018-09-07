package p01.basic;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyAPP extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Circle c = new Circle(140, 100, 30);
		Group root = new Group(c);
		Scene s = new Scene(root, 300, 200);
		stage.setTitle("My App");
		stage.setScene(s);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
