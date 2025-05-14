package study.io.serial;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -2339270445541809922L;

	private String myNmae;
	private int age;
	public Person(String myName, int age) {
		this.setMyNmae(myName);
		this.setAge(age);
	}
	public String getMyNmae() {
		return myNmae;
	}
	public void setMyNmae(String myNmae) {
		this.myNmae = myNmae;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
