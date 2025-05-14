package study.io.change;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream in =null;
		InputStreamReader is =null;
		
		try {
			in = new FileInputStream("test.txt");
			//인코딩을 설정
			//파일이 생성할때 사용한 인코딩과 같아야 한다.
			//인코딩을 기입하지 않으면 system에 따른다.
			is = new InputStreamReader(in, "UTF-8");
			
			int read =0;
			while((read =is.read())!= -1) {
				System.out.print((char)read);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
