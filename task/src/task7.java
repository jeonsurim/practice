import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;

		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		score = scan.nextInt();

		if (score >= 90)
			System.out.println("학점 A");
		else if (score >= 80)
			System.out.println("학점 B");
		else
			System.out.println("학점 C");

	}

}
