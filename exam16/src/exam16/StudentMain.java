package exam16;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st01 = new Student();
		Student st02 = new Student();
		
		st01.myName = "홍길동";
		st02.myName = "고길동";
		
		st01.shoolInfo();
		System.out.println("나의 학교는"+Student.school);
		st02.shoolInfo();

	}

}
