import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		int days = 0;
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�");
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();

		switch (month) {
		case 1:
		case 6:
			days = 31;
			break;
		default:
			days = 31;
			break;

		}
		System.out.print("���� �� ����" + days);
	}

}
