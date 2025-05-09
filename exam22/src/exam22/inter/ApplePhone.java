package exam22.inter;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

public class ApplePhone implements Phone {
	
	private int batteryCapacity = 40;
	private boolean isOn = false;

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		if(batteryCapacity > 30) {
			System.out.println("@@@PowerOn@");
			isOn = true;
		}else {
			System.out.println("LowBettery");
		}
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("@@@PowerOff@");
		isOn = false;
		
		
	}

	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void watchYoutube() {
		if(batteryCapacity> 10) {
			System.out.println("=======watchin youtube===");
			batteryCapacity -=10;
			System.out.println("battery is "+ this.batteryCapacity+"%");
			
		}else {
			System.out.println("LowBettery");
			powerOff();
		}
		
	}

	@Override
	public void charge() {
		if(this.batteryCapacity<Phone.MAX_BATTERY_CAPACITY) {
			System.out.println("=========start charging======");
			//5프로 이상 차이날때는 5를 더하고 아니면 100에서 현재값을 뺀만큼 더하기
			if(Phone.MAX_BATTERY_CAPACITY - this.batteryCapacity >5) {
				this.batteryCapacity += 5;
			}
			this.batteryCapacity += 5;
			
		}
		
	}

}
