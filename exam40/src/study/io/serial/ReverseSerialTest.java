package study.io.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReverseSerialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fs = null;
		ObjectInputStream io = null;
		try {
			fs = new FileInputStream("object_data.txt");
			io = new ObjectInputStream(fs);
			
			while(fs.available() != 0) {
				Person p = (Person)io.readObject();
				System.out.println("이름 : " + p.getMyNmae()+ " 나이: "+ p.getAge());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (io != null) {
					io.close();
				}
				if (fs != null) {
					fs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
