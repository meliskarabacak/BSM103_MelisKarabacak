package GetterVeSetter;


public class BookMain {

	public static void main(String[] args) {


		Book b1= new Book("Harry Potter", 400,"Powling","kodlama Vakti");
		b1.setNumberOfPage(400);
		System.out.println(b1.getNumberOfPage());		
		
		
		Book b2 =new Book("Lov",500,"peter Jackson","kodlama Vakti");
		b2.setName("Love");
		System.out.println(b2.getName());
	}

}
