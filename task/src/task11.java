import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coffee;
		Scanner scan = new Scanner(System.in);

		System.out.print("어떤 커피 드릴까요? 1.보통: ,2:설탕 3.프림");
		coffee = scan.nextInt();

		System.out.print("1. 물을 준비한다");
		System.out.print("2. 종이컵을 준비한다");
		switch (coffee) {
		case 1:
			System.out.println("보통 커피를 탄다");
			break;
		case 2:
			System.out.println("설탕 커피를 탄다");
			break;
		default:
			System.out.println("아무커피나 탄다");

		}
	}

}
