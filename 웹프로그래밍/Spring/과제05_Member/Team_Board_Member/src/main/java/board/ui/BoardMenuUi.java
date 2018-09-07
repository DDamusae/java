package board.ui;

import java.util.Scanner;

import ui.AbstractUiTemplate;

public class BoardMenuUi extends AbstractUiTemplate {
	
	private SelectBoardUi selectBoardUi;
	
	public void setSelectBoardUi(SelectBoardUi selectBoardUi) {
		this.selectBoardUi = selectBoardUi;
	}
	
	@SuppressWarnings("resource")
	@Override
	public void showMenu() {
		System.out.println("---------------------");
		System.out.println("[게시판]    [메뉴]");
		System.out.println("1. 이전 메뉴");
		System.out.println("2. 게시판 목록");
		System.out.println("번호를 입력한 후 Enter 키를 눌러주세요.");
		Scanner sc = new Scanner(System.in);
		execute(sc.nextInt());
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
	public void execute(int number) {
		switch(number) {
		case 1:
			break;
		case 2:
			this.selectBoardUi.show();
			break;
		}
	}
	
	
}
