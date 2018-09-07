package p01.basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyApp2 extends Application {

	public static void main(String[] args) {
		launch(args); //1.시작
	}

	@Override
	public void start(Stage p) throws Exception {
		Button btn = new Button(); //컨트롤러(버튼) 생성
		btn.setText("로그인"); //버튼 글자 생성
//		btn.setOnAction(new EventHandler<ActionEvent>() { //버튼 클릭시 이벤트
//			@Override
//			public void handle(ActionEvent arg0) {
//				System.out.println("버튼을 누르면 콘솔에 출력");
//			}
//		}); //익명 구현 객체로 구현
		
		//람다식으로 구현
		btn.setOnAction ( event -> System.out.println("버튼을 누르면 콘솔에 출력") ); 
		
		StackPane root = new StackPane(); //컨테이너(스택페인) 생성
		root.getChildren().add(btn); //패널에 버튼 추가
		
		Scene s = new Scene(root, 300, 250); //씬 생성
		p.setTitle("Hello World"); //윈도우 타이틀 설정
		p.setScene(s); //스테이지에 씬 세트
		p.show(); //스테이지 보여줌
	}
}
