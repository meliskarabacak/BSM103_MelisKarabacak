package BaharDonemiHafta2;

public class Uygulama2 {

	public static void main(String[] args) {

//		1 dizi de bir sayi 2 kere varsa false dondur, sadece 1 kere varsa true dondur
			int[]list = {3,8,12,2,9,17,43,-8,46};
			System.out.println(isUnique(list));
		}
		public static boolean isUnique(int[]list) {
			for (int i=0;i<list.length;i++) {
				for(int j=i+1;j<list.length;j++) {
					if(list[i]==list[j]) {
						return false;
					}
				}
			}
			return true;

	}

}
