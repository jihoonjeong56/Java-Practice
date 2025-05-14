package study.thread.multiple;

public class Bank {

	private int money;
	public int getMoney() {
		return this.money;
		
	}
	public synchronized void addMoney(int money) {
		this.money += money;
	}
}
