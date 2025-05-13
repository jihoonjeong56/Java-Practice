package exam30;

public class Ex15 {

	public static void main(String[] args) {
		// Math class
		//올림
		System.out.println("3.51올림: " +Math.ceil(3.51));
		//내림
		System.out.println("13.61내림: " +Math.floor(13.61));
		//반올림
		System.out.println("12.8반올림: " +Math.round(12.8));
		//절대값
		System.out.println("절대값1: " +Math.abs(-4.55));
		System.out.println("절대값2: " +Math.ceil(-50));
		//최대값
		int maxValue = Math.max(30, 60);
		//최솟값
		int minValue = Math.min(40, 70);
		
		System.out.println("40, 70의 최소값: "+minValue);
		System.out.println("30,60의 최대값: "+maxValue);


	}

}
