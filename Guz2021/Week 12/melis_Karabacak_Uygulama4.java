package hafta12Uygulamalari;
import java.util.Scanner;
public class melis_Karabacak_Uygulama4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir kelime giriniz=");
		String kelime=input.nextLine();
		
		
						System.out.println("kelimeyi giriniz"+kelime);
						System.out.println("kelimelerin tersten yazilmis hali   "+tersten(kelime));
			}
	public static String tersten(String kelime) {
		String ters="";
		for (int sayac=kelime.length();sayac>0;sayac--) {
			
			ters+=kelime.substring(sayac-1,sayac);
			
		}
		return ters;
		
		
	} 

}
