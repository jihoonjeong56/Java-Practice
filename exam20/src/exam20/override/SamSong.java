package exam20.override;

public class SamSong extends Computer{
	
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("hello");
		System.out.println("PowerOn");
	}
	public void powerOff() {
		super.powerOff();
		System.out.println("Bye");
		System.out.println("PowerOff");
	}
	

}
