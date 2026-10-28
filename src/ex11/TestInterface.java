package ex11;

//interface 특징 :  규칙을 부여, 통일성

interface Ipo{
	void input();
	
	void process();
	
	void output();
	
}

class Job implements Ipo{

	@Override
	public void input() {
		System.out.println("입력을 받습니다.");
	}

	@Override
	public void process() {
		System.out.println("process");		
	}

	@Override
	public void output() {
		System.out.println("출력을 합니다.");
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		Job job1 = new Job();
		job1.input();
		job1.process();
		job1.output();

	}

}
