package BaharDonemHafta5;

import java.util.*;

public class StarAdd {
//ekleme silme ornek
	public static void main(String[] args) {
	
		ArrayList<String>words= new ArrayList<String>();
		words.add("kalem");
		words.add("Bilgisayar");
		words.add("bartin");
		
		System.out.println("dongu oncesi "+ words);
		System.out.println("liste uzunlugu: "+ words.size());
		
		for(int index= 0; index< words.size();index+=2) {
			words.add(index, "*");
		}
		System.out.println("dongu sonrasi: "+ words);
		System.out.println("liste uzunlugu: "+ words.size());
		
		
//		for (int index= words.size()-2; index>=0;index-=2){
//		words.remove(index);
		
//		yildizlari silmek isteyince 		
		for(int index= 0; index< words.size();index++) {
		words.remove(index);
	}
		System.out.println("silme sonrasi: "+ words);
		System.out.println("silme liste uzunlugu: "+ words.size());
		
}}
