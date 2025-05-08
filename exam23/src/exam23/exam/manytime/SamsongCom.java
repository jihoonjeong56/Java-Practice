package exam23.exam.manytime;

public class SamsongCom implements Computer{

	@Override
	public void powerOn() {
		System.out.println("삼성");
		System.out.println("전원이 켜집니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("삼성");
		System.out.println("전원이 꺼집 니다.");
		
	}

}
