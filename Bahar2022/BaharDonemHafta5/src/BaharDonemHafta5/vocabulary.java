package BaharDonemHafta5;
import java.util.*;
import java.io.*;

public class vocabulary {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input= new Scanner(new File("Test.txt"));
		
		ArrayList<String> list= new ArrayList<String>();
		list= getWords(input);
		System.out.println(list);
	}

	public static ArrayList<String> getWords(Scanner input){
	
			ArrayList <String>words = new ArrayList<String>();
			System.out.println(input.hasNext());
			while (input.hasNext()) { //boolean hasNext() true donderir
				words.add(input.next().toLowerCase());
//				String next = input.next().toLowerCase();
//				if(!words.contains(next))
//					words.add(next);
			}
		
		
		return words;
}
}