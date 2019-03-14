class Car {
	Car() {
		System.out.println("파라미터 없음");
	}
	Car(String str) {
		System.out.println("파라미터 있음"+str);
	}
}

class Sedan extends Car {
	Sedan(String str) {
		System.out.println("서브클래스"+str);
		
	}
}
public class Cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sedan sedan1= new Sedan("여기요");
	}

}
