package uygulama1;
import java.util.*;
public class Stutter {

	public static void main(String[] args) {

//		3,4,8,9,1
//		3,3,4,4,8,8,9,9,1,1
		
		int data[]= {3,4,8,9,1};
		
		Queue <Integer>q =new LinkedList<>();
		for(int n: data)
			q.add(n);
		System.out.println(q);
	stutter(q);
	System.out.println(q);
	}
	
public static void stutter(Queue<Integer>q) {
	 int size= q.size();
	 while(size>0) {
		 int n = q.remove();
		 q.add(n);
		 q.add(n);
		 size--;
	 }
//	aynisi stackle yap
	
}
	
	
}
