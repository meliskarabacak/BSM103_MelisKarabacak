package AccessModifiers;

public class CarMain {

	public static void main(String[] args) {
		Car c1= new Car();
//		c1.engine=10;		//engine private oldugu icin hata veriyor
		c1.speed=10;
		c1.print();
		c1.run();
		System.out.println(c1.speed);
	}

}


//public butun siniflar erisebilir
//private alt sinif dahil baska hicbir sinif erisemez
//protected alt siniflar ve ayni packageler erisebilir
//<default> (on tanimli) ayni packagler erisebilir
