package BaharDonemHafta5;

import java.util.*;

public class Fruits {

	public static void main(String[] args) {

		
		ArrayList<String>list= new ArrayList<>();
		
		list.add("elma");
		list.add("muz");
		list.add("portakal");
		
		System.out.println(list);
		
		for(String fruit: list)
			System.out.println(fruit);
	}

}
