package ex03;

import java.time.LocalDate;

/*RESCENE
 원이 리브 미나미 메이 제나
 2004.2006.2006.  2008.2008. 
 리더 보컬 보컬   랩   보컬
 */

class GMember{
	// Fields : private
	private String 	name;
	private int		bYear;
	private String	role;
	
	//생성자 class 붙이면 안됨.
	//생성자 : 객체를 생성 (new) 할때 실행되는 명령
	//함수는 같은 이름의 인자( , )갯수 상관없이 생성가능
	//OverLoading 같은 이름의 생성자가 (인자가 다른) 여러개 있습니다.
	//Constructor 생성자
	//기본 생성자 : 인자 없는 생성자, NoArgsConstructor
	public GMember() {
		System.out.println("HI 반가워요");
		
	}
	//모든 인자 생성자 AllArgsConstructor
	public GMember(String name, int bYear , String role) {
		this.name = name; // 전역변수(this) name에 인자 name을 넣는 것
		//잘못된 값을 입력하거나 등등의 사유로 코드 추가하기 위해 만든 곳이 생성자
		if(bYear <= 1910)
			bYear = LocalDate.now().getYear();
		this.bYear = bYear;
		this.role = role;
	}
	//method : public
	public void info(){
		int age = LocalDate.now().getYear() - bYear;
		System.out.printf("이름 : %s 생년 : %d 나이 : %d 포지션 : %s"
				, name ,bYear ,age ,role );
		
	}
	
}

public class MemberTest {
	//null 널 : 변수를 만들었으나 사용한 적 없다.
	//"" 빈문자열은 표현이 다름 empty String
	// 모두 대문자 : Ctrl + Shift + x
	// 모두 소문자 : Ctrl + Shift + y
	
	public static void main(String[] args) {
		
		GMember r0 = new GMember();
		//선언시 값입력 없으면 int는 0 String은 null
		/*
		r.name = "원이";
		
		r.info();
		
		GMember r2 = new GMember(); //new 초기화 하지 않으면 오류 발생 GMember r2 = null; 초기화
		System.out.println(r2);
//		r2.info();
 */
		//GMember r1 = new GMember();
		//r1.name = "원이"; //오류 : private 변수를 .으로 직접 사용했다.
		//The field GMember.name is not visible
		
		//private 변쉐 값을 넣는 방법 2가지
		//1. 생성자를 이용
		GMember r1 = new GMember("원이", 2004, "리더");
		r1.info();
		
		//2. Getter / Setter 를 사용
		
		
		
	}

}
