
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String data = null;
//		System.out.println(data.toString());

		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		}else {
			System.out.println("[������]");
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			System.out.println("��1 ��2");

		}



	}

}
