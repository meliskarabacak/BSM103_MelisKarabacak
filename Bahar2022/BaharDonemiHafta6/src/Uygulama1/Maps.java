package Uygulama1;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		
		Map <Integer,String> citys=new HashMap<>();
//			<key,value> key sadece 1 kere olabilir 
		
		citys.put(34,"Istanbul");
		citys.put(06, "Ankara");
		citys.put(35, "Izmir");
		citys.put(55, "Samsun");
		
		System.out.println(citys);
		System.out.println("Indeksler - Keys"+ citys.keySet());
		System.out.println(citys.values());
		
		Map<Integer,Set<String>>citys2= new HashMap<>();
		
		citys2.put(34,  new TreeSet<String>());
		citys2.get(34).add("istanbul");
		citys2.get(34).add("Besiktas");
		citys2.get(34).add("Eminonu");
		citys2.put(6,new TreeSet<String>());
		citys2.get(6).add("Ankara");
		citys2.get(6).add("Cankara");
		System.out.println(citys2);
	}

}
