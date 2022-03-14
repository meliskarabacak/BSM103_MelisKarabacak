package FinalSinavi;

import java.util.Arrays;

public class DiziBirlestirme {
	public static void main (String[]args) {
		int[]list1= {1,2,3,4};
		int[]list2=	{5,6,7,8};
		int[]list3=append(list1,list2);
		System.out.println(Arrays.toString(list3));
	}

	public static int[] append (int []list1, int[]list2) {
		int[]result =new int[list1.length+ list2.length];
		for(int i=0; i<list1.length; i++) {
			result[i]=list1[i];
			
		}
	for( int i=0;i<list2.length;i++) {
		result[i+list2.length]=list2[i];
		
	}
	return result;

	}

}
