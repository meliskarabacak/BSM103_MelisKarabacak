package uygulama1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		String data[]= {"java","php","phyton","C","c++"};
		
		Queue<String>q = new LinkedList<>();
		
		for(String word: data)
			q.add(word);
		
		System.out.println("queue= "+ q);
		System.out.println("peek= "+q.peek());
		System.out.println(q.size());
	}

}
