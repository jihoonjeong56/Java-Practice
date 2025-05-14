package study.io.bytes;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExam {

	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream("test.txt");
			
			int read  =0;
			while((read = in.read()) != -1) {
				//아스키코드표에 듸해서 문자 --> 숫자로 표기하여 리천
				System.out.print((char)read);
			}
		
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
