
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
			Class clazz = Class.forName("java.lang.String2");
		} /*catch (Exception e) {
			e.printStackTrace();
		}*/
		catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}


	}

}
