import java.util.Scanner;

public class Pizzamaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int pizza;
		int ret;

		System.out.printf("A��, � ���� �帱���? (1:������, 2:��������, 3:�Ұ��) ");
		pizza = s.nextInt();
		ret = pizza_maker(pizza);
		System.out.printf("A�� �ֹ��Ͻ� ���� ���� �ֽ��ϴ�. \n");

		System.out.printf("B��, � ���� �帱���? (1:������, 2:��������, 3:�Ұ��) ");
		pizza = s.nextInt();
		ret = pizza_maker(pizza);
		System.out.printf("B�� �ֹ��Ͻ� ���� ���� �ֽ��ϴ�. \n");

		System.out.printf("C��, � ���� �帱���? (1:������, 2:��������, 3:�Ұ��) ");
		pizza = s.nextInt();
		ret = pizza_maker(pizza);
		System.out.printf("C�� �ֹ��Ͻ� ���� ���� �ֽ��ϴ�. \n");
	}

	static int pizza_maker(int order) {
		System.out.printf("# 1.�а���� ���� ������ ����� \n");
		System.out.printf("# 2. �� ���� �丶�� �ҽ��� �ٸ��� \n");
		switch (order) {
		case 1:
			System.out.printf(" # 3.�������� �ø��� \n");
			break;
		case 2:
			System.out.printf("# 3.���ڸ� �ø��� \n");
			break;
		case 3:
			System.out.printf("# 3.�Ұ�⸦ �ø��� \n");
			break;
		default:
			System.out.printf("# 3.�ƹ��͵� �ø��� �ʴ´� \n");
			break;
		}

		System.out.printf("# 4.�ø���, ���ĸ� �ø��� \n");
		System.out.printf("# 5. ��¥���� ġ� �ø���\n");
		System.out.printf("# 6. ȭ���� ���´�\n");
		System.out.printf("# 5. ���� �ڽ��� �����Ѵ�\n");

		return 0;
	}
}
