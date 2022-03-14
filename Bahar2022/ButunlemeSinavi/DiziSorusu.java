package ButunlemeSinavi;

public class DiziSorusu {

	public static void main(String[] args) {
int[] list1= new int [5];
int[] list2= new int [5];
System.out.println(allLess(list1,list2));
System.out.println(StringSorusu.isAllVowels("vrm"));
	}
	public static boolean allLess (int[]list1,int[]list2) {
		if(list1.length!= list2.length) {
			return false;
		}

for(int i=0; i<list1.length;i++) {
	if(list1[i]>=list2[i]) {
		return false;
	}
}
return true;
	}

}
