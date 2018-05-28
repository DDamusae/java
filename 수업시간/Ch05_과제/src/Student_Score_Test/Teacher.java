package Student_Score_Test;

public class Teacher {
	// 클래스 변수
	int sum = 0;
	int avg = 0;
	// 생성자
	

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	//학생 정보 입력
	public void inPut(Student stu){
		sum = stu.getKor() + stu.getEng() + stu.getMath();
		avg = sum/3;
	}
	
	// 합계 메소드
	public int sum() {
		return sum;
	}
	// 평균 메소드
	public int avg() {
		return avg;
	}
}
