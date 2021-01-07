
public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
				
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");

		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수  없습니다.");
		} catch (Exception e) {
			//모든 에러를 잡아줌. 앞에 있을 경우 위의 catch문은 먼저 실행되지 않음.
			//e.printStackTrace();
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			//에러가 없어도 실행된다. 생략 가능한 구문.
			System.out.println("다시 실행하세요.");
		}



	}

}
