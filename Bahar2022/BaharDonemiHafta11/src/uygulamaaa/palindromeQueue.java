package uygulamaaa;

import java.util.*;


public class palindromeQueue {

	public static void main(String[] args) {
System.out.println("String giriniz");
Scanner input = new Scanner (System.in);
String inputString =input.nextLine();
Queue queue = new LinkedList();
 for( int index= inputString.length()-1;index>=0; index--) {
	queue.add(inputString.charAt(index));
	
}
String reverseString= "";
while (!queue.isEmpty()) {
	reverseString = reverseString + queue.remove();
}
if(inputString.equals(reverseString)) {
	System.out.println("girilen kelime paindromdur");
}
else {
	System.out.println("girilen kelime palindrome degildir");
	
}
	}}
	


