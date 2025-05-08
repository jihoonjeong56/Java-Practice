package exam20.override;

import exam20.ComicBook;

public class BookCare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComicBook b  = new ComicBook("transformer",3000);
		
		//default 제한자의 경우 같은 패키지 내의 클래스 끼리만 가능
		//BookCare의 다른 패키지 클래스라 접근 안됌
		//b.title = "33"; 
		

	}

}
