package melis;
import java.util.*;
public class ikiBoyutluDiziler {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);


							System.out.print("dizinin ilk boyutunu giriniz:");
							int sayi=input.nextInt();
							int[]list1=new int[sayi];
							
							System.out.println("dizinin ikinci boyutunu giriniz");
							int []list2=new int [sayi];
							sayi=input.nextInt();
											
												
											for(int counter=0;counter<list1.length;counter++) {
												System.out.println("list1  "+(counter+1)+"sayiyi giriniz");
												list1[counter]=input.nextInt();
												
											}
											for(int counter=0;counter<list2.length;counter++) {
												System.out.println("list2  "+(counter+1)+"sayiyi giriniz");
												list2[counter]=input.nextInt();
												
												
												
												
											}
												int[]result=new int[list1.length+list2.length];
												
												for(int counter=0;counter<list1.length;counter++) {
													result[counter]=list1[counter];
												
													
												}
												for(int counter=0;counter<list2.length;counter++) {
													
													result[counter+list1.length]=list2[counter];
													
													
													
													
													
												}
									for(int element:result) {
										System.out.print(element+"  " );
									}
										
	}
}
										
									
				
	


