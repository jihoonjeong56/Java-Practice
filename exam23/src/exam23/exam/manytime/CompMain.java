package exam23.exam.manytime;

public class CompMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerRoom room = new ComputerRoom();
		
		room.setCom1(new LZCom());
		room.setCom2(new SamsongCom());
		
		room.allPowerOn();
		room.allPowerOff();

	}

}
