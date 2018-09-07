package ui;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import team.ui.SelectTeamUi;

public class MenuUi extends AbstractUiTemplate {
	
	private SelectTeamUi selectTeamUi;
	
	public void setSelectTeamUi(SelectTeamUi selectTeamUi) {
		this.selectTeamUi = selectTeamUi;
	}

	@Override
	protected void showMenu() {
		System.out.println("-----------------------------");
		System.out.println("[선수 명단]    [메뉴]");
		System.out.println();
		System.out.println("1. 종료");
		System.out.println("2. 팀 목록");
		System.out.println();
		System.out.println("번호를 입력한 후 Enter 키를 눌러주세요.");
	}

	@Override
	protected int getMaxMenuNumber() {
		return 2;
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
			System.exit(number);
			break;
		case 2:
			this.selectTeamUi.show();
		}
	}
	
	public static void main(String[] args) {
		//스프링 설정 파일 읽기
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		MenuUi menuUi = (MenuUi) context.getBean("menuUi");
		menuUi.showMenu();
		Scanner sc = new Scanner(System.in);
		menuUi.execute(sc.nextInt());
		sc.close();
		context.close();
	}
}
