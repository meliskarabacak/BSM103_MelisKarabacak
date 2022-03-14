package uygulama1;
import java.util.*;
public class uygulama11 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("uc sayi gir: ");
		double sayi1=input.nextDouble();
		double sayi2=input.nextDouble();
		double sayi3=input.nextDouble();
		double sonuc= maximum (sayi1, sayi2, sayi3);
		System.out.println("en büyük sayi: "+sonuc);
	}
	public static double  maximum (double sayi1,double sayi2,double sayi3) {
	double max =sayi1;
	if (sayi2>max)
	max=sayi2;
	if (sayi3>max)
		max= sayi3;
	return max;
	

	}

}
