package ex10;


//interface 이름은 형용사를 쓴다.
//interface는 내부에 코드를 작성하지 않는다.
interface IDuck{
	void swim();
}
interface IRacoon{
	void dig();
}

// implements 뒤에 interface를 ,로 여러개 들고올 수 있다.
// Java에서는 다중상속이 안되고 interface로 implements를 사용하여 다중상속을 비슷하게 구현이 가능 
class DuckRacoon implements IDuck,IRacoon{

	@Override
	public void dig() {
		System.out.println("땅을 팝니다.");
	}

	@Override
	public void swim() {
		System.out.println("헤엄을 칩니다.");
	}

}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.dig();
		dr.swim();

	}

}
