package exam23.exam.type;

public class Bus extends Car{

	public Bus(String myName) {
		super(myName);
		
	}
	public void getInfo() {
		System.out.println("버스이름은"	+ this.getMyName()+"입니다.");
	}

}
