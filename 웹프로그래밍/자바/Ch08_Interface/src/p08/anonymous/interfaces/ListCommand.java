package p08.anonymous.interfaces;

public class ListCommand implements Command {

	@Override
	public void execute() {
		System.out.println("전체 목록을 보여준다.");
	}

}
