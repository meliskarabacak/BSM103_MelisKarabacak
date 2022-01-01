package uygulama1;
import java.security.SecureRandom;

public class uygulama13 {

	public static void main(String[] args) {
		SecureRandom input=new SecureRandom();
		int zar;
		for (int sayac=0;sayac<100;sayac++) {
			zar= input.nextInt(6)+1;
			System.out.println(zar+" ");
			if (sayac%10==0)
				System.out.println();
		}
		
		

	}

}
