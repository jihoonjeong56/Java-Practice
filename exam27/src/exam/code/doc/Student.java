package exam.code.doc;
/***
 * 학생정보를 담는 클래스
 * @author javastudy
 * 
 */
public class Student {

	private String myName;
	/**
	 * 학생나이
	 */
	private int age;
	/**
	 * 학생이름을 반환하는 메서드
	 * @return myName
	 */
	public String getMyName() {
		return myName;
	}
	/**
	 * 학생이름을 등록하는 메서드
	 * @param myName
	 */
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
