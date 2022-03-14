package melis;
import java.util.*;
public class modAlma {

	public static void main(String[] args) {
	System.out.print("SAYI GIR");
		Scanner sc= new Scanner (System.in);
	
	int sum=0;	
	int number=sc.nextInt();
	number=Math.abs(number);
							while(number>0)
							{
							sum=sum+(number%10);
							number=number/10;
							
							}System.out.println("Toplam:  "+ sum);
	}
	

}
