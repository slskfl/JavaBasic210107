
public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���ѱ�� throw>>�ݵ�� try������ ó���Ǿ���Ѵ�.
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
