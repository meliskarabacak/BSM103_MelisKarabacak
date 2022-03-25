package ArrayListDeneme;

import java.util.*;

public class deneme2 {

	public static void main(String[] args) {
		ArrayList<String>sayi=new ArrayList<>();
		boolean empty = sayi.isEmpty();
		System.out.println("bos mu? "+ empty);
		

		sayi.add("besyuz");
		sayi.add("ikiyuz");
		sayi.add("dortyuz");
		sayi.add("ucyuz");
		sayi.add("yuz");
		
		System.out.println("uzunluk "+sayi.size());
		System.out.println(sayi);
		Collections.sort(sayi);
		System.out.println("alfabe siralandiktan sonra sayilar:"+ sayi);
		boolean aranan= sayi.contains("dortyuz");
		System.out.println("aranan sayi var mi:"+ aranan);
		
		boolean silinen = sayi.remove("dortyuz");
		System.out.println("silinen: "+ silinen);
		System.out.println("yeni sayilarin boyutu "+sayi.size());
		
		Object element = sayi.get(0);
		String str = (String) element;
		System.out.println("index 0 :"+ str);
		
		sayi.clear();
		System.out.println(" hepsinini clear ile sildikten sonra boyutu: "+ sayi.size());
		
			}
		  }
