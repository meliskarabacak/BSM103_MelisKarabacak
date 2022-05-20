package Uygulamalar;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		System.out.println("String giriniz:");
		Scanner input= new Scanner (System.in);
		String inputString=input.nextLine();
		String reverseString="";
		
		int length= inputString.length();
		
		for( int index= length-1; index>=0; index--) {
			reverseString= reverseString+ inputString.charAt(index);
		}
		if(inputString.equals(reverseString)) {
			System.out.println("girilen kelime palindrome");
		}
		else {
			System.out.println("girilen kelime palindrome degildir");
		}
	}

}
