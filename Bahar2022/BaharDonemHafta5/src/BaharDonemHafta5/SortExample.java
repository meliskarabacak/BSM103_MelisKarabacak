package BaharDonemHafta5;

import java.util.*;

public class SortExample {

	public static void main(String[] args) {

		ArrayList<String>words= new ArrayList<String>();
		words.add("kalem");
		words.add("Bilgisayar");
		words.add("bartin");
		words.add("kitap");
		
		System.out.println("siralamadan once: "+ words);
		System.out.println(words.get(0));
		Collections.sort(words); 
		System.out.println("siralamadan sonra " +words);
		
		
		

}
}