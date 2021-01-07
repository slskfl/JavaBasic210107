
public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외 떠넘기기 throw>>반드시 try문으로 처리되어야한다.
		findClass();
	}

	public static void findClass()  {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
