import java.util.Scanner;

public class Pizzamaking2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pizza;
		System.out.printf("어떤 피자 주문하시겠습니까? (1:베이컨, 2:포테이토, 3:불고기) ");
		pizza = s.nextInt();

		System.out.printf("# 1.밀가루로 피자 반죽을 만든다 \n");
		System.out.printf("# 2. 그 위에 토마토 소스를 바른다 \n");

		switch (pizza) {
		case 1:
			System.out.printf(" # 3.베이컨을 올린다 \n");
			break;
		case 2:
			System.out.printf("# 3.감자를 올린다 \n");
			break;
		case 3:
			System.out.printf("# 3.불고기를 올린다 \n");
			break;
		default:
			System.out.printf("# 3.아무것도 올리지 않는다 \n");
			break;
		}

		System.out.printf("# 4.올리브, 양파를 올린다 \n");
		System.out.printf("# 5. 모짜렐라 치즈를 올린다\n");
		System.out.printf("# 6. 화덕에 굽는다\n");
		System.out.printf("# 5. 피자 박스에 포장한다\n");

		System.out.printf("손님 주문하신 피자 여기 있습니다. \n");

		System.out.printf("어떤 피자 주문하시겠습니까? (1:베이컨, 2:포테이토, 3:불고기) ");
		pizza = s.nextInt();

		System.out.printf("# 1.밀가루로 피자 반죽을 만든다 \n");
		System.out.printf("# 2. 그 위에 토마토 소스를 바른다 \n");

		switch (pizza) {
		case 1:
			System.out.printf(" # 3.베이컨을 올린다 \n");
			break;
		case 2:
			System.out.printf("# 3.감자를 올린다 \n");
			break;
		case 3:
			System.out.printf("# 3.불고기를 올린다 \n");
			break;
		default:
			System.out.printf("# 3.아무것도 올리지 않는다 \n");
			break;
		}

		System.out.printf("# 4.올리브, 양파를 올린다 \n");
		System.out.printf("# 5. 모짜렐라 치즈를 올린다\n");
		System.out.printf("# 6. 화덕에 굽는다\n");
		System.out.printf("# 5. 피자 박스에 포장한다\n");

		System.out.printf("손님 주문하신 피자 여기 있습니다. \n");

		System.out.printf("어떤 피자 주문하시겠습니까? (1:베이컨, 2:포테이토, 3:불고기) ");
		pizza = s.nextInt();

		System.out.printf("# 1.밀가루로 피자 반죽을 만든다 \n");
		System.out.printf("# 2. 그 위에 토마토 소스를 바른다 \n");

		switch (pizza) {
		case 1:
			System.out.printf(" # 3.베이컨을 올린다 \n");
			break;
		case 2:
			System.out.printf("# 3.감자를 올린다 \n");
			break;
		case 3:
			System.out.printf("# 3.불고기를 올린다 \n");
			break;
		default:
			System.out.printf("# 3.아무것도 올리지 않는다 \n");
			break;
		}

		System.out.printf("# 4.올리브, 양파를 올린다 \n");
		System.out.printf("# 5. 모짜렐라 치즈를 올린다\n");
		System.out.printf("# 6. 화덕에 굽는다\n");
		System.out.printf("# 5. 피자 박스에 포장한다\n");

		System.out.printf("손님 주문하신 피자 여기 있습니다. 감사합니다. \n");
	}
}
