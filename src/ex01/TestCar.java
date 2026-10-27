package ex01;

public class TestCar {

	// CRLF : 줄바꿈 문자
	// LF : Line Feed 		: \n 0x0a(010) 
	// CR : Carriage Return : \r 0x0d(13)
	// unix, linux, android : \n
	// Window				: \r\n
	// Mac					: \r
	
	public static void main(String[] args) {
		System.out.println("우리집차\n보유현황\n");
		//자바에서 줄바꿈은 \n
		String name1 = "아빠차";
		String color1 = "Black";
		int year1 = 2023;
		
		System.out.println("차이름:" + name1);
		System.out.println("색상:" + color1);
		System.out.println("연식:" + year1);
		
		String name2 = "엄마차";
		String color2 = "Red";
		int year2 = 2025;

		System.out.println("차이름:" + name2);
		System.out.println("색상:" + color2);
		System.out.println("연식:" + year2);
		
		String name3 = "내차";
		String color3 = "Pink";
		int year3 = 2026;

		System.out.println("차이름:" + name3);
		System.out.println("색상:" + color3);
		System.out.println("연식:" + year3);

		
	}

}
