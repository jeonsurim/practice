import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		int days = 0;
		System.out.print("일수를 알고 싶은 월을 입력하시오");
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
		System.out.print("월의 날 수는" + days);
	}

}
