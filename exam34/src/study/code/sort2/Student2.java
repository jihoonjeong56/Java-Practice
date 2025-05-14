package study.code.sort2;

public class Student2  {

	private String name;
	private int score;
	
	public Student2(String name, int score) {
		this.setName(name);
		this.setScore(score);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("이름 :"+ this.getName() );
		sb.append(", 점수 : "+ this.getScore());
		return sb.toString();
	}
	
}
