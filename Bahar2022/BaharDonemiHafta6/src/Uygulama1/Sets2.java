package Uygulama1;
import java.util.*;
public class Sets2 {

	public static void main(String[] args) {
		Set<String>words=new HashSet<>();
		
			words=read();
			System.out.println(words);
			for(String word:read()) // words.addAll(read());
				words.add(words);
			
			System.out.println(words);		
	}

	public static Set<String>read()throws FileNotFoundExceotion{
		System.out.println("okumak istediginiz dosya ismi: ");
		Scanner input=new Scanner(System.in);
		
		String file= input.next();
		Scanner in=new Scanner(new File(file));
		
		Set <String>temp= new HashSet<>();
		
		while (in.hasNext()) {
			String word= in.nextLine().toLowerCase();
			temp.add(word);
		
		}
		return temp;
		
	}
}
