class Car {
	Car() {
		System.out.println("�Ķ���� ����");
	}
	Car(String str) {
		System.out.println("�Ķ���� ����"+str);
	}
}

class Sedan extends Car {
	Sedan(String str) {
		System.out.println("����Ŭ����"+str);
		
	}
}
public class Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sedan sedan1= new Sedan("�����");
	}

}
