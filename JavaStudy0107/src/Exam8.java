
public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외 떠넘기기 throw>>반드시 try문으로 처리되어야한다.
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
