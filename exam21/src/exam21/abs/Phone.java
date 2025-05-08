package exam21.abs;

public abstract class Phone {
	
	//추상메서드
	public abstract void openingLogo();
	
	public void powerOn() {
		this.openingLogo();//자식 클래스가 정의한 메서드 내용 출력
		System.out.println("핸드폰이 켜집니다.");
		
	}
	public void powerOff() {
		
		System.out.println("핸드폰이 꺼집니다.");
		
	}
	


}
