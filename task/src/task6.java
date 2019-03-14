import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		final int goal = 1000;
		int score;
		int bonus;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.print("실적을 입력하시오: ");
		score = scan.nextInt();

		if (score >= goal) {
			result = "실적달성";
			bonus = score - goal / 10;
		} else {
			result = "실적달성못함";
			bonus = 0;
			System.out.println(result + "보너스:" + bonus);

		}
	}
}