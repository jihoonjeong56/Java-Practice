package exam22.inter2;

public class BlutoothMIC implements MicroPhone, Speaker{

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("마이크에 장착된 스피커에서 소리가 나온다");
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("마이크에 대로 노래를 부른다.");
		
	}

}
