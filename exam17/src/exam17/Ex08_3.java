package exam17;

public class Ex08_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 34000;
		int count=0;
		while(true) {
			if(money<1500) {
				System.out.println("버스를"+count+"만큼 탔음");
				System.out.println(money+"남음 충전요망");
				return;
			}
			money-= 1500;
			count++;
			
		}
	}

}
