package Cat;

public class main {

	public static void main(String[] args) {
		
		Cat kedi1 = new Cat ();
		kedi1.colour = "sari";
		System.out.println(kedi1.age+ "," + kedi1.colour+ ","+ kedi1.name);
		
		Cat kedi2 = new Cat ("Tarcin",2);
		System.out.println(kedi2.age+","+ kedi2.colour+","+ kedi2.name);
		
		Cat kedi3 = new Cat ("Tekir", "gri", 3);
		System.out.println(kedi3.age+ ","+ kedi3.colour+ ","+ kedi3.name);
		
		Cat kedi4 = new Cat (2, "aaa","gri");
		System.out.println(kedi4.age+","+kedi4.colour+","+kedi4.name);
	

	}
}
