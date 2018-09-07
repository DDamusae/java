package ui;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import board.ui.BoardMenuUi;
import team.ui.SelectTeamUi;

public class MenuUi extends AbstractUiTemplate {
	
	private SelectTeamUi selectTeamUi;
	private BoardMenuUi boardMenuUi;
	
	public void setSelectTeamUi(SelectTeamUi selectTeamUi) {
		this.selectTeamUi = selectTeamUi;
	}
	public void setBoardMenuUi(BoardMenuUi boardMenuUi) {
		this.boardMenuUi = boardMenuUi;
	}

	@Override
	protected void showMenu() {
		System.out.println("---------------------");
		System.out.println("[선수 명단]    [메뉴]");
		System.out.println("1. 종료  2. 팀 목록  3. 게시판");
		System.out.println("번호를 입력한 후 Enter 키를 눌러주세요.");
	}

	@Override
	protected int getMaxMenuNumber() {
		return 3;
	}

	@Override
	protected int getMinMenuNumber() {
		return 1;
	}

	@Override
	protected void execute(int number) {
		switch(number) {
		case 1:
			System.out.println("종료");
			System.exit(0);
		case 2:
			this.selectTeamUi.show();
			break;
		case 3:
			this.boardMenuUi.showMenu();
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//스프링 설정 파일 읽기
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		MenuUi menuUi = (MenuUi) context.getBean("menuUi");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			menuUi.showMenu();
			menuUi.execute(sc.nextInt());
		}
	}
}
