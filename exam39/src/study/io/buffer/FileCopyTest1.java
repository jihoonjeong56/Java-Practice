package study.io.buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in =null;
		FileOutputStream out =null;
		try {
			in = new FileInputStream("candle.jpg");
			out = new FileOutputStream("candle_copy.jpg");
			
			long start = System.currentTimeMillis();//현재시간을 1000분의 1초단위로 표시
			System.out.println("읽기시작");
			
			int read =0;
			while((read = in.read())!= -1) {
				out.write(read);
			}
			System.out.println("이미지 복사");

			long end = System.currentTimeMillis();//현재시간을 1000분의 1초단위로 표시

			double time = (double)(end - start) /1000;
			System.out.println("걸린시간 : "+ time);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
				if(in != null) {
					in.close();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
