package uygulama1;
import java.util.*;
public class uygulama7 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int[]sayi= new int [6];
		for (int a=1;a<6;a++)
			sayi[a]=0;
		System.out.print("Anket notunu gir: ");
		int not= input.nextInt();
		while (not!= -1) {
			sayi[not]++;
			System.out.print("anket notunu gir: ");
			not= input.nextInt();
		}
		System.out.println();
		System.out.println("Not   Sayi");
		for(int sayac=1; sayac<6;sayac++)
			System.out.println(""+sayac+"      "+sayi[sayac]);
	
		}
		

	}


