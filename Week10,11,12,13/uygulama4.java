package uygulama1;

public class uygulama4 {
	public static void main (String []args) {
		int[]a= new int [10];
		a[0]=87;
		a[1]=68;
		a[2]=94;
		a[3]=100;
		a[4]=83;
		a[5]=78;
		a[6]=85;
		a[7]=91;
		a[8]=76;
		a[9]=87;
		int toplam=0;
		for (int sayac=0; sayac<10;sayac++) {
			toplam=toplam+a [sayac];
					
		}System.out.println("Dizini elemanlarin toplami: " +toplam);
		
		
	}

}
