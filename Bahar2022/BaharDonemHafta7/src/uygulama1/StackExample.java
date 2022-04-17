package uygulama1;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		String data[]= {"java","php","phyton","C","c++"};
		Stack<String> s= new Stack<>();
		
		//set add
		// map put
		//push pop peek size isEmpty 
		
		for (String word: data) {
			s.add(word);
			
		}
		System.out.println("Stack= "+s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println("Stack= "+s);
		System.out.println(s.size());
	while(!s.isEmpty()) {
		System.out.println(s.pop());
		System.out.println("stack= "+s);
	}
	
	}

}
