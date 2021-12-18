package hafta12Uygulamalari;
import java.util.Scanner;
public class melis_Karabacak_Uygulama1 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		 System.out.println("ogrenci sayisini gir");
		 int ogrenciSayisi= input.nextInt();
		 System.out.println(ogrenciSayisi+ "adet ogrenci notu hesaplanacaktir");
for(int sayac=1; sayac<= ogrenciSayisi; sayac++) {
	System.out.println( sayac+". ogrencin vize notunu giriniz");
int  vizeNotu= input.nextInt();
System.out.println(sayac+ ". final notu gir");
int  finalNotu= input.nextInt();

	System.out.println("ogrencinin vize notu: "+vizeNotuHesaplama(vizeNotu));
	System.out.println("ogrencinin final notu: "+ finalNotuHesaplama(finalNotu));
}

	}


public static double vizeNotuHesaplama(int vizeNotu) {
	double not= 0;
	if(vizeNotu>=80) {
		not= vizeNotu*1.10;}
		else if (vizeNotu>= 60) {
			not= vizeNotu*1.05;}
	if (vizeNotu>= 100 ) {
		not=100;
	}
	return not;

	
		}
public static double finalNotuHesaplama (int finalNotu) { 
	double not =0;
	if (finalNotu>=70) {
		not= finalNotu* 1.10;}
	
	
else if (finalNotu>=40) {
	not= finalNotu*1.05;}
	
if (not>100) 
	not=100;
return not;

}
		
	}
