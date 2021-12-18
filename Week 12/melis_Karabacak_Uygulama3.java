package hafta12Uygulamalari;
import java.util.Scanner;
public class melis_Karabacak_Uygulama3 {

	public static void main(String[] args) {
Scanner input= new Scanner(System.in);
System.out.println("Eleman sayisi gir");
int elemanSayisi= input.nextInt();
int dizi []= new int [elemanSayisi];


for (int index = 0; index< elemanSayisi; index++) {
	System.out.println("dizinin"+index+ "indexli elemanini giriniz");
	dizi[index]=input.nextInt();
	

}
double ortalama = ortalama(dizi);
System.out.println(ortalama);

	}
	
	
	public static double ortalama(int []dizi) {
		double average = 0.0;
		int total= 0;
		
		for (int index=0; index<dizi.length; index++) {
		total+= dizi[index];
		
	}
		average= (double)total/dizi.length;
		return average;
		

}
}

