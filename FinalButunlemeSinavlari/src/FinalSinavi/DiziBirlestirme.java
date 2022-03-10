package FinalSinavi;
import java.util.*;
public class DiziBirlestirme {

	public static void main(String[] args) {
	int[]a1= {1,2,3,4,5,6};
	int []a2= {7,8,9,10};
	int[]a3= merge(a1,a2);
	
	System.out.println("dizilerin birlesmis hali: "+Arrays.toString(a3));
	}
	public static int []merge (int []a1, int []a2){
		int []result=new int [a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			result[i]=a1[i];
		}
		for (int i=0;i<a2.length;i++) {
			result[a1.length+i]=a2[i];
			
		}
		return result;
		

	}

}
