package Hafta14Uygulamalari;

public class melis_karabacak_uygulama1 {

	public static void main(String[] args) {
		String []array = {"alpha","beta","beta","alpha"};
		System.out.println(isPalindrome(array));



	}
	public static boolean isPalindrome(String[] array) {
		
		for (int sayac=0; sayac<array.length/2; sayac++) {
			if (!array[sayac].equals(array[array.length-1-sayac]))
return false;

		}
		return true;
	}

}
