package exam17;

public class Bank {
	private int money;
	
	public void setMoney(int money) {
		if(money <0) {
			System.out.println("잘못된 입력");
			return;//일찍종료
		}
		this.money = money;
	}
	//돈 출력
	public int getMoney() {
		return money;
	}

}
