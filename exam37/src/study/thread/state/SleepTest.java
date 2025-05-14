package study.thread.state;

public class SleepTest {

	public static void main(String[] args) {
		
		Runnable rn = ()-> {
			int sum =0;
			for(int i=1; i<=100; i++) {
				try {
				if(i%2 == 0) {
					//시간은 1000분의 1초
					Thread.sleep(1000);
					sum += i;
					System.out.println(i);
				}
				}catch(InterruptedException e) {
					System.out.println("스레드 에러 ");
					e.printStackTrace();
				}
			}
			System.out.println("합 : "+sum);
		};

		Thread t = new Thread(rn);
		t.start();
	}

}
