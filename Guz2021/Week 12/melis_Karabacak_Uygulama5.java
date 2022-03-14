package hafta12Uygulamalari;
import java.util.*;
public class melis_Karabacak_Uygulama5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
				System.out.println("Bir metin giriniz:");
				String metin=input.nextLine();
				
				System.out.println("Hece sayisi giriniz :");
				int hece=input.nextInt();
				
				foksiyon(metin,hece);

	}
	public static void foksiyon(String str,int n) {
		int sayac=0;
						
						for(int sayacc=0;sayacc<str.length()/n;sayacc++) {
							
							System.out.println(str.substring(sayac,sayac+n));
							sayac=sayac+n;
							
						}
							System.out.println(str.substring(sayac,str.length()));
		
		
	}

}
