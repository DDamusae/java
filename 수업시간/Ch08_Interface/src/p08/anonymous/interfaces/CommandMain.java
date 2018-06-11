package p08.anonymous.interfaces;

public class CommandMain {

	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		
		WriteCommand wc = new WriteCommand();
		ListCommand lc = new ListCommand();
		
		cp.process(wc);
		cp.process(lc);
		
		//Anonymous Interface(익명구현객체)
		Command c = new Command() {
			
			@Override
			public void execute() {
				System.out.println("Anonymous Interface");
				
			}
		};
		c.execute();

		
		//2. parameter에 익명 구현 객체 만들기
		// cp.process(lc); 형식 사용
		cp.process(new Command() {

			@Override
			public void execute() {
				System.out.println("Parameter Anonymous Interface");
			}
			
		});
		
		
	}
}
