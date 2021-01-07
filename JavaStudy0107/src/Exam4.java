
public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data1 = args[0];
		String data2 = args[1];

		try {
			int value1 = Integer.parseInt(data1);
			System.out.println("[data1] "+ value1);
	
			int value2 = Integer.parseInt(data2);
			System.out.println("[data2] "+ value2);
		} catch (NumberFormatException e) {
			System.out.println("[data2] 숫자로 변환할 수 없습니다.");
		}

	}

}
