
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);
		int value2 = Integer.parseInt(data2);
		System.out.println(value2);
		//java.lang.NumberFormatException가 발생함.
*/
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
