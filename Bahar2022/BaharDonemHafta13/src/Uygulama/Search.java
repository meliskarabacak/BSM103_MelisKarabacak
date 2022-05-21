 package Uygulama;

public class Search {

	public static void main(String[] args) {
		int [] numbers = { 63,18,51,37,29,49,42,11};
		int []numbers2= {11,18,29,37,49,51,63,69};
		
		int index= indexOf2(numbers2,63);
//		int index= indexOf(numbers,29);
		
		if ( index!=-1) 
			System.out.println("elemanin indexi "+ index);
			else 
				System.out.println("eleman bulunamadi");
}		
	public static int indexOf2(int[] numbers,int target) {
		int i=0;
		while(i<numbers.length&& numbers[i]<= target) {
			if(numbers[i]==target) 
				return i;
			else
				i++;
			}
		return -1;
		}
//	target -> aradigimiz deger
	public static int indexOf(int [] numbers, int target) {
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]== target)
				return i;
		}
		return -1;
}}
