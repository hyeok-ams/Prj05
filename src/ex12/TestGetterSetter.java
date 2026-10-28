package ex12;

class Emp{
	//fields
	private int eno;
	private String name;
	private String phone;

	
	//Getter / Setter : 함수 형태

	public Emp(int eno, String name, String phone) {
		this.eno = eno;
		this.name = name;
		this.phone = phone;
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	//method
	public void info() {
		System.out.printf("%d %s %s \n" , eno ,name , phone);
	}
	
}

public class TestGetterSetter {

	public static void main(String[] args) {
		Emp emp1 = new Emp();
		//getter setter로 작업 입력을 하거나 입력된 값을 변경하고 불러올때 사용
		emp1.setEno(1);
		emp1.setName("장원영");
		emp1.setPhone("010-1111-1111");
		emp1.info();
		//setter 다른 class내부에 private 변수를 Setter함수를 사용해서 지정
		//getter 다른 class내부에 private 변수를 불러옴
//		System.out.println(emp1.getEno());
		//생성자로 작업 new할때 입력되는것이라 정보변경 불가능
		Emp emp2 = new Emp(2,"카리나","010-2222-2222");
		emp2.info();
		
		
	}

}
