package study.io.text;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw =null;
		try {
			fw = new FileWriter("write.txt", false);
			
			fw.write("안녕하세요\n");
			fw.write("너무 더워요\n");
			fw.write("very hot\n");
		
			//buffer에서 내려서 실제 파일에 생성
			//fw.flush();
			System.out.println("파일 생성 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null){
					//auto flush 기능
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
