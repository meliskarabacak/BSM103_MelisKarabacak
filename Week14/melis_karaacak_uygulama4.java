package Hafta14Uygulamalari;

public class melis_karaacak_uygulama4 {

	public static void main(String[] args) {
		System.out.println(carpmaIslemi(4,5));
	
//carpma islemi kullanmadan 2 sayiyi carpan recursive metodu
		
	}
	public static int carpmaIslemi(int sayi1,int sayi2) {
		if( sayi2==0)
			return 0;
		return sayi1+ carpmaIslemi(sayi1,sayi2-1);
	}
}

