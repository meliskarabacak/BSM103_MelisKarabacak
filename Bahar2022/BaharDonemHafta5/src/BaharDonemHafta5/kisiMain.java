package BaharDonemHafta5;

import java.util.*;

public class kisiMain {

	public static void main(String[] args) {
		ArrayList<kisi>bireyler= new ArrayList<>();
		
		bireyler.add(new kisi("Ahmet",24));
		bireyler.add(new kisi("Kaya",30));
		bireyler.add(new kisi("hayri",40));
				
//				bireyler.forEach(birey->{ System.out.println("isim "+biey.getIsim()+", yas:"+birey.getYas());});
				
//				System.out.println();
				
				for(kisi birey: bireyler) {
					System.out.println("isim: "+birey.getIsim()+", yas: "+birey.getYas());
				}
	}

}
