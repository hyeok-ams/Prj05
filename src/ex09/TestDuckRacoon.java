package ex09;

// class는 다중상속 불가능
// interface를 이용하여 다중상속을 구현한다.
// class 다중 상속 : C++ 만 가능 , java랑 C#은 안됨
// 오리너구리 class = 오리 class + 너구리 class

//interface
//모든 함수가 abstract 일 때 해당 클래스 interface를 표현 가능하다.
/*
abstract class Sachic{
	abstract int add (int v1, int v2);
	abstract int sub (int v1, int v2);
	abstract int mul (int v1, int v2);
	abstract int div (int v1, int v2);
	
} // == 위아래가 같은 내용

//interface 는 abstract의 모임 내부엔 abstract를 사용가능하며 내부에 생략가능
interface Sachic{
	int add (int v1, int v2);
	int sub (int v1, int v2);
	int mul (int v1, int v2);
	int div (int v1, int v2);
}
*/

class Duck{
	void swim() {
		System.out.println("헤엄을 칩니다.");
		
	}
	
}
/*

abstract class Racoon{
	abstract void dig();
}
*/

interface Racoon{
	void dig();
}
interface Racoon1{
	void work();
}

// Java extends 뒤에는 한개의 class 만 사용가능
//extends는 한개의 class만 상속 implements는 interface의 다중상속을 가져와서 내부에 코딩을 해야함 
class DuckRacoon extends Duck implements Racoon, Racoon1 {
	@Override
	public void dig() {
		System.out.println("땅을 팝니다.");
	}

	@Override
	public void work() {
		System.out.println("뒤뚱뒤뚱 걷습니다.");
		
	}
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		dr.work();
	}

}


