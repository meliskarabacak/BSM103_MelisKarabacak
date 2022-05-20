package uygulamaaa;
import java.util.*;
public class palindromeStack {

	public static void main(String[] args) {
	System.out.println("String giriniz:");
	Scanner input= new Scanner (System.in);
	String inputString=input.nextLine();
	Stack stack = new Stack();
	for ( int index =0; index<inputString.length(); index++) {
		stack.push(inputString.charAt(index));
	}
	String reverseString="" ;
	while (!stack.isEmpty()) {
		reverseString = reverseString+stack.pop();
		
	}
		if (inputString.equals(reverseString)) {
			System.out.println("Girilen kelime palindromdur");
			
		}
		else {
			System.out.println("Girilen kelime palindrom degildir");
			
		}
	

	}

}
