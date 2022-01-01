package uygulama1;
import java.security.SecureRandom;
public class uygulama6 {

	public static void main(String[] args) {
		SecureRandom randomNumber= new SecureRandom();
		int [] sayi= new int[7];
		for (int a= 1; a<=6;a++)
			sayi[a]=0;
		int zar;
		for(int sayac=1; sayac<=6000000; sayac++) {
		zar=randomNumber.nextInt(6)+1;
		sayi [zar]= sayi [zar]+1;
		}
		System.out.println("yüz Sayi");
		for (int yuz=1; yuz<=6;yuz++)
			System.out.println(" "+yuz+" "+sayi[yuz]);
		}
		

	}


