package Hafta14Uygulamalari;

public class melis_karabacak_Uygulama3 {
	public static void main (String[] args){
	int[]list= {1,2,3,4,5};
	int deger = minGap(list);
	System.out.println(deger);
	}

	public static int minGap (int []list) {
		if (list.length<2)
			return 0;
		int min= list[1]- list [0];   //dizinin ilk 2 elemanini birinden cikar		
		for (int index=2; index<list.length; index++) {
			int gap=list[index]- list[index-1];
			if(gap<min)
				min=gap;
	
}
		return min;
	}

}
