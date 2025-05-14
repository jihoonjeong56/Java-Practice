package study.code.thread;

import java.util.Iterator;

public class MyThread extends Thread{

	//스레드가 실행하면 자동으로 실행
	@Override
	public void run() {
		int sum =0;
		for(int i=1; i<=100; i++) {
			sum = sum +i;
		}
		System.out.println("값 : "+ sum);
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 : "+ threadName);
	}
}
