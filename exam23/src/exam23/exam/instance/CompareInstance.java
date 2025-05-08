package exam23.exam.instance;

import exam23.exam.manytime.Computer;
import exam23.exam.manytime.LZCom;
import exam23.exam.manytime.SamsongCom;

public class CompareInstance {
	public static void getMyType(Computer com) {
		if(com instanceof SamsongCom) {
			System.out.println("Samsong");
		}else if(com instanceof LZCom) {
			System.out.println("Lz");
		}else {
			System.out.println("what?");
		}
		
	}
	public static void main(String[] args) {
	
		SamsongCom sam = new SamsongCom();
		LZCom lz = new LZCom();
		
		CompareInstance.getMyType(sam);
		CompareInstance.getMyType(lz);
	}
}
 