import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coffee;
		Scanner scan = new Scanner(System.in);

		System.out.print("� Ŀ�� �帱���? 1.����: ,2:���� 3.����");
		coffee = scan.nextInt();

		System.out.print("1. ���� �غ��Ѵ�");
		System.out.print("2. �������� �غ��Ѵ�");
		switch (coffee) {
		case 1:
			System.out.println("���� Ŀ�Ǹ� ź��");
			break;
		case 2:
			System.out.println("���� Ŀ�Ǹ� ź��");
			break;
		default:
			System.out.println("�ƹ�Ŀ�ǳ� ź��");

		}
	}

}
