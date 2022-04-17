package uygulama1;

import java.util.*;

public class Test {

	public static void main(String[] args) {

//		3,4,8,2,1,9,3        5,8,2,1,9
		
		int data[] = {3,4,7,4,0,8,3};
		
		Queue<Integer>q= new LinkedList<>();
		for (int n: data)
			q.add(n);
		
		System.out.println("queue="+q);
		removeAll(q,4);
		System.out.println("queue="+q);
		
	}
	public static void removeAll(Queue<Integer>q,int value) {
		
		
		for(int i=0;i<q.size(); i++) {
			int n= q.remove();
//			System.out.println(n+"elemani cikartildi");
//			System.out.println("current queue"+q);
			if(n!=value) {
				q.add(n);
//				System.out.println(n+"elemani eklendi");
//				System.out.println(q+"q");
			}
		}
	}

}
