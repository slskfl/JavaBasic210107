
public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���ѱ�� throw>>�ݵ�� try������ ó���Ǿ���Ѵ�.
		findClass();
	}

	public static void findClass()  {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

}
