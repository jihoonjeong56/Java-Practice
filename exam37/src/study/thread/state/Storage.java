package study.thread.state;

public class Storage {

	private int stackCount = 10;//기본적으로 물건 10개
	public synchronized void addStack(int stackCount) {
		this.stackCount+= stackCount;
		
		if(this.stackCount >= 10) {
			System.out.println("나르세요");
			notify();
		}
	}
	public synchronized void popStack(int leaveCount) {
		if(leaveCount > this.stackCount) {
			this.stackCount = 0;	
		}else {
			this.stackCount -=leaveCount;
		}
		System.out.println("현재 짐 개수: "+ this.getStackCount());
		try {
		if(this.stackCount ==0) {
			System.out.println("짐이 없음 대기");
			wait();
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	public int getStackCount() {
		return this.stackCount;
	}
}
