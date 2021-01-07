
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
			System.out.println("���� �Ű����� ���� �����մϴ�.");

		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� ��  �����ϴ�.");
		} catch (Exception e) {
			//��� ������ �����. �տ� ���� ��� ���� catch���� ���� ������� ����.
			//e.printStackTrace();
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		} finally {
			//������ ��� ����ȴ�. ���� ������ ����.
			System.out.println("�ٽ� �����ϼ���.");
		}



	}

}
