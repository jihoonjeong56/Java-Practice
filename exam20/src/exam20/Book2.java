package exam20;

public class Book2 {
	String title;
	int price;
	
	public Book2(String title, int price) {
		this.title = title;
		this.price = price;
	}
	public void info() {
		System.out.println("책의 제목은 "+this.title +"이고 가격은 "+this.price+"입니다.");
	}

}
