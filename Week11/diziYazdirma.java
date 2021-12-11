package melis;
import java.util.*;
public class diziYazdirma {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int [] array= new int [4];
		System.out.println("dizinizin uzunlugu   :"+array.length);
		 					
								for(int counter=0;counter<array.length;counter++) {
									
									System.out.println("sayi giriniz: ");
									array[counter]=input.nextInt();
									
									
									
								}
											for(int counter=0;counter<array.length;counter++) {
												System.out.println("Dizinin elemanidir"+array[counter]); 
											
											
											}	
											int ciftsayi=0;
											for(int element:array) {
												
												if(element%2==0) {
												ciftsayi++;
												
												}
											double ciftSayiOrani=ciftsayi*100.0/array.length;
											System.out.println("Cift sayi orani= "+ciftSayiOrani);
											}
					 						
											}
													
	}
	


