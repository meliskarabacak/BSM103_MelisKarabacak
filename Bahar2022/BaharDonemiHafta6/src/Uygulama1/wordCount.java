package Uygulama1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;


public class wordCount {

	public static void main(String[] args) throws FileNotFoundException {
		countWords();
	}
	public static void countWords()  throws FileNotFoundException{
		Scanner input = new Scanner(new File("test.txt"));
		Set<String> words=new Hashset<>();
		
		while (input.hasNext()) {
			String word= input.next().toLowerCase();
			words.add(word);
			
		}
		System.out.println("kelimeler: "+words);
		System.out.println("kelime sayisi "+words.size());
		
//		for(String word: words)
//			System.out.println(word);
//		
		
	}}