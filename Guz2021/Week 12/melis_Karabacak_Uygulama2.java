package hafta12Uygulamalari;
import java.util.Arrays;
import java.util.Scanner;
public class melis_Karabacak_Uygulama2 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		System.out.println("Ogrenci sayisini giriniz: ");
		int ogrenciSayisi= input.nextInt();
		
		System.out.print(ogrenciSayisi+ " adet ogrencinin numarasi hesaplanacak");
	double ortalama []= new double [ogrenciSayisi];
	
	for (int sayac=1 ; sayac<= ogrenciSayisi; sayac++) {
		System.out.println(sayac+ ". vize notu girin");
		int vizeNotu= input.nextInt();
		
		System.out.println(sayac+ ". final notu giriniz");
		int finalNotu= input.nextInt();
		ortalama[sayac-1]= ortalama(vizeNotu,finalNotu);	
		
		
	}
	System.out.println("tum ogrencilerin gecme puani");
	System.out.println(Arrays.toString(ortalama));
	
	}
	public static double ortalama (int vizeNotu, int finalNotu ) {
		vizeNotu= (int)vizeNotuHesaplama(vizeNotu);
		finalNotu=(int)finalNotuHesaplama(finalNotu);
		double ortalama= vizeNotu*0.4 + finalNotu*0.6;
		return ortalama;		
	}
	
	
	
public static double vizeNotuHesaplama (int vizeNotu) {
double not=0;
if (vizeNotu>=80) {
	not= vizeNotu* 1.10;
	}
else if (vizeNotu>=60) {
	not= vizeNotu*1.05;
}
if (vizeNotu>= 100) {
	not=100;
}
return not;
}

public static double finalNotuHesaplama(int finalNotu) {
	double not= 0;
	if (finalNotu>= 70) {
		not= finalNotu*1.10;
		
	}
	else if (finalNotu>=40) {
		not= finalNotu*1.05;
	
	}
	if (finalNotu>=100) {
		not=100;
		
	}
	return not;
}














}
