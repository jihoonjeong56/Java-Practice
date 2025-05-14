package study.io.text;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		FileReader re = null;
		try {
			re = new FileReader("test.txt");
			
			int read =0;
			//읽을 것이 없으면 -1 리턴
			while((read = re.read())!= -1) {
				System.out.print((char)read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(re != null){
					re.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
