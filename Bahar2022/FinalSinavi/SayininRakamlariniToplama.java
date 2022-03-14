package FinalSinavi;

import java.util.Scanner;

public class SayininRakamlariniToplama {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("sayi giriniz: ");
		int sayi =input.nextInt();

		int toplam=0;
		while (sayi>0) {
			int rakam=sayi%10;
			toplam+=rakam;
			sayi/=10;
		}
		System.out.println("toplam: "+toplam);

	}
	}

