package Uygulama;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] numbers2 = { 11,18,29,37,49,51,63,69};

		int index= binarySearchR(numbers2,63,0,numbers2.length-1);
//		int index= binarySearch(numbers2,37);
		
		
		if ( index!=-1) 
			System.out.println("elemanin indexi "+ index);
			else 
				System.out.println("eleman bulunamadi");
}		

	
	
	public static int binarySearchR(int [] numbers,int target,int min,int max) {
		if(min>max)
			return -1;
		else {
			int mid = (min+max)/2;
			
			if( numbers[mid]==target)
				return mid;
			else if (numbers[mid]<target)
				return binarySearchR(numbers,target,mid+1,max);
			else 
				return binarySearchR(numbers,target,min, mid-1);
		}
	}
	public static int binarySearch ( int[] numbers, int target) {
		int min =0;
		int max= numbers.length-1;
		
		while(min<=max) {
			int mid= (max+min)/2;
			if(numbers[mid]==target)
				return mid;
			
			else if(numbers[mid]<target)
				min=mid+1;
			else 
				max= mid-1;
			
		}
			return -1;
		}
	}


