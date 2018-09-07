package Bank;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

	private static void createAccount() {
		// TODO Auto-generated method stub

		accountArray[i] = new Account(null, null, 0);

		System.out.println("-----------------");
		System.out.println("계좌 생성");
		System.out.println("-----------------");

		System.out.print("계좌번호: ");
		accountArray[i].setAno(scanner.next());

		System.out.print("계좌주: ");
		accountArray[i].setOwner(scanner.next());

		System.out.print("초기입금액: ");
		accountArray[i].setBalance(scanner.nextInt());

		System.out.println("계좌가 생성되었습니다.");
		i++;
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("-----------------");
		System.out.println("계좌 목록");
		System.out.println("-----------------");
		for (int i = 0; accountArray[i] != null; i++) {
			System.out.print(
					accountArray[i].getAno() + "  " + accountArray[i].getOwner() + "  " + accountArray[i].getBalance());
			System.out.println();
		}
	}

	private static void deposit() {
		// TODO Auto-generated method stub

		System.out.println("-----------------");
		System.out.println("예끔");
		System.out.println("-----------------");
		System.out.print("계좌번호:");
		Account ac = findAccount(scanner.next());
		
		if (ac == null) {
			System.out.println("다시입력");
			deposit();
		} else {
			System.out.print("예금액: ");
			ac.setBalance(ac.getBalance() + scanner.nextInt());

			System.out.println("예금이 성공되었습니다.");
			System.out.println();
		}
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("-----------------");
		System.out.println("출금");
		System.out.println("-----------------");
		System.out.print("계좌번호:");
		Account ac = findAccount(scanner.next());
		
		if (ac == null) {
			System.out.println("다시입력");
			withdraw();
		} else {
			System.out.print("출금액: ");
			ac.setBalance(ac.getBalance() - scanner.nextInt());

			System.out.println("출금이 성공되었습니다.");
			System.out.println();
		}
	}

	private static Account findAccount(String ano) {
		for (int i = 0; accountArray[i] != null; i++) {
			try {
				if (accountArray[i].getAno().equals(ano)) {
					return accountArray[i];
				}
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("없는 계좌번호");
			}
		}
		return null;
	}
}
