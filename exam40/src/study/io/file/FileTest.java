package study.io.file;

import java.io.File;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("text.txt");
		
		if(f.exists()) {
			System.out.println("존재함");
		}else {
			System.out.println("존재하지 않음");
		}
		 System.out.println("파일크기 : "+ f.length()+"(byte)");
		 System.out.println("파일경로(객체에 주어진 경로) : "+ f.getPath());
		 System.out.println("파일절대경로 : "+ f.getAbsolutePath());
		 
		 System.out.println("파일 이름 : "+ f.getName());
		 System.out.println("파일? : "+ f.isFile());
		 System.out.println("폴더 ? : " + f.isDirectory());
		 System.out.println("부모 : "+f.getParent());//절대경로일경우 나옴
		 File f2 = new File("F:\\test\\te.txt");
		 if(!f2.getParentFile().exists()) {
			 f2.getParentFile().mkdirs();
		 }
		 FileOutputStream out = null;
		 try {
			out = new FileOutputStream(f2);
			out.write('a');
			out.write('b');
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
