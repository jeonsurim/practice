import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		final int goal = 1000;
		int score;
		int bonus;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		score = scan.nextInt();

		if (score >= goal) {
			result = "�����޼�";
			bonus = score - goal / 10;
		} else {
			result = "�����޼�����";
			bonus = 0;
			System.out.println(result + "���ʽ�:" + bonus);

		}
	}
}