package study.io.bytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutTest {

	public static void main(String[] args) {
		FileOutputStream out = null;
		try {
			//이어쓰기(true) = 기존파일이 있다면 이어쓰기, 없다면 새로 생성
			//이어쓰기(false) = 기존파일이 있다면 덮어쓰기,  없다면 새로 생성
			out = new FileOutputStream("write.txt", false);
			
			//write(int val)은 단일값만 가능
			out.write(97);
			out.write('B');
			out.write('c');
			out.write('\n');

			String str="문장을 출력합니다.";
			byte[] strArray = str.getBytes();
			
			out.write(strArray);
			System.out.println("파일생성완료");
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(out != null) {
					out.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
