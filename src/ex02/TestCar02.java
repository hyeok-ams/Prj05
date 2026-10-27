package ex02;

//access modifier : 접근제한자
//private	: 해당 클래스에서만 사용가능(선언된 곳) 
//package	: 해당 패키지에서만 사용가능 (접근제한자를 생략하면 기본 Package)(선언된 곳)
//protected : package + proteced(상속관계에서 공유)
//public 	: 모든 곳에서 사용 가능 다른 class 에서도

//class		: 설계도 <- 우리가 표현하고 싶은 대상(객체)
class Car{
	//fields
	 String name;
	 String color;
	 int year;
	//methods
	void info(){
		System.out.println("차이름:" + name);
		System.out.println("색상:" + color);
		System.out.println("연식:" + year + "\n");
	}
	
}


public class TestCar02 {
	public static void main(String [] args) {
		Car car1 = new Car();
		car1.name = "아빠차";
		car1.color = "Black";
		car1.year = 2023;
		car1.info();

		Car car2 = new Car();
		car2.name = "엄마차";
		car2.color = "Red";
		car2.year = 2025;
		car2.info();
		
		Car car3 = new Car();
		car3.name = "내차";
		car3.color = "Pink";
		car3.year = 2026;
		car3.info();

				
	}
}
