package exam25;

public class Exam01Main {
	public static void main(String[] args) {
		Person p = new Person();
		p.introduce();
		
		String a = "한글";
		
		//익명클래스
		Person p2 = new Person() {
			@Override
			public void introduce() {

				System.out.println(a+" 배우는 사람");
			}
		};
		p2.introduce();
	}

}
