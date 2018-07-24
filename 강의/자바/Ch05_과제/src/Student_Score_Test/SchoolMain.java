package Student_Score_Test;

import java.util.Scanner;

public class SchoolMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Student stu = new Student();
		Teacher tea = new Teacher();;
		
		while(true) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 총점 출력");
			System.out.println("3. 학생 평균 출력");
			System.out.println("4. 프로그램 종료");

			int select = scan.nextInt();
			switch(select) {
			case 1:
				System.out.println("학생 이름 입력: ");
				String name = scan.next();
				stu.setName(name);
				System.out.println(name + "의 국어 점수: ");
				int kor = scan.nextInt();
				stu.setKor(kor);
				System.out.println(name + "의 영어 점수: ");
				int eng = scan.nextInt();
				stu.setEng(eng);
				System.out.println(name + "의 수학 점수: ");
				int math = scan.nextInt();
				stu.setMath(math);
				System.out.println("======입력완료======");
				tea.inPut(stu);
				break;
			case 2:
				System.out.println(stu.getName() + " 의 총점: " + tea.sum());
				break;
			case 3:
				System.out.println(stu.getName() + " 의 평균: " + tea.avg());
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
