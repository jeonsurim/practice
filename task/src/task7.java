import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		score = scan.nextInt();

		if (score >= 90)
			System.out.println("���� A");
		else if (score >= 80)
			System.out.println("���� B");
		else
			System.out.println("���� C");

	}

}
