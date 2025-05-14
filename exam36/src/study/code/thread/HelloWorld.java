package study.code.thread;

public class HelloWorld {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("스레드 이름 : " + name);
	}

}
