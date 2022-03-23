package EncapsulationKapsulleme;

public class Book {
public String name, author,publisher;
public int numberOfPage;
//private int numberOfPage;

Book(String name, int numberOfPage, String author,String publisher) {
	
	this.name=name;
	this.author= author;
	this.publisher=publisher;
	
	if(numberOfPage<1) {
		this.numberOfPage=10;
	}
	else 
		this.numberOfPage=numberOfPage;
	}
}
//public void Page() {
//	System.out.println(numberOfPage);
//}
