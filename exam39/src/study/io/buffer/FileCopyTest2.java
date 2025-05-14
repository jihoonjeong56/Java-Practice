package study.io.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in =null;
		BufferedInputStream bin = null;
		FileOutputStream out =null;
		BufferedOutputStream bout = null;
		
		try {
			
			in = new FileInputStream("candle.jpg");
			bin = new BufferedInputStream(in);
			out = new FileOutputStream("candle_copy.jpg");
			bout = new BufferedOutputStream(out);
			
			long start = System.currentTimeMillis();//현재시간을 1000분의 1초단위로 표시
			System.out.println("읽기시작");
			
			int read =0;
			while((read = bin.read())!= -1) {
				bout.write(read);
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
				if(bout != null) {
					bout.close();
				}
				if(out != null) {
					out.close();
				}
				if(bin != null) {
					bin.close();
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
