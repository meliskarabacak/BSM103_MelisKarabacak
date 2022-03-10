package FinalSinavi;
import java.util.*;
public class SayiRakamlarinToplami {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("sayi giriniz: ");
	int sayi=input.nextInt();
	int toplam=0;
	while(sayi>0) {
		int rakam=sayi%10;
		toplam+=rakam;
		sayi/=10;
		}
	System.out.println("toplam: "+toplam);
	

	}

}
