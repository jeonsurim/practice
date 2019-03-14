import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius;
		double area;
		System.out.println("반지름을 입력하시오");
		radius = input.nextDouble();
		area = 3.14 * radius * radius;

		System.out.println(area);
	}

}
