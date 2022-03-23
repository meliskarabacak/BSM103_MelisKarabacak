package EncapsulationKapsulleme;

public class BookMain {

	public static void main(String[] args) {

		Book b1= new Book("Harry Potter", -400,"Powling","kodlama Vakti");
		
		System.out.println(b1.numberOfPage);
		
//		b1.Page();		//privateleri static ile cagirilabilir
		
		
		
		//yorum satirdakiler numberOfPage private olsaydi yapilan islemler
		
	}

}
