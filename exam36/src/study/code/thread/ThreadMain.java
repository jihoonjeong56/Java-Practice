package study.code.thread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th = new MyThread();
		th.setName("더하기 스레드");
		
		//스레드 시작
		th.start(); 
		System.out.println(th.isAlive());

	}

}
