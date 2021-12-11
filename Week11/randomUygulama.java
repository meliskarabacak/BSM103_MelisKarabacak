package melis;
import java.util.*;

public class randomUygulama {

	public static void main(String[] args) {
		Random sc=new Random();
		int tries=0;
		int sum=0;
		 					
		do {
			int number1=sc.nextInt(6)+1;
			int number2=sc.nextInt(6)+1;
			sum=number1+number2;
			tries++;
			
				System.out.println(number1+"+"+number2+"="+sum);
		}
							while(sum!=7);
								
								
								
							
System.out.println("Tebrikler "+tries+" Deneme yapildi ");
	}

}
