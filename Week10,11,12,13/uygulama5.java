package uygulama1;

public class uygulama5 {

	public static void main(String[] args) {
	int []a= new int [11];
	a[0]=0;
	a[1]=0;
	a[2]=0;
	a[3]=0;
	a[4]=0;
	a[5]=0;
	a[6]=1;
	a[7]=2;
	a[8]=4;
	a[9]=2;
	a[10]=1;
	System.out.println("Not dagilimi: ");
	for (int satir=0; satir<11;satir++) {
		if (satir==10)
			System.out.print("100: ");
		else if (satir==0)
			System.out.print("0-9: ");
		else
			System.out.print((satir*10)+"-"+ (satir*10+9)+":");
		for(int yildiz=0;yildiz<a[satir];yildiz++)
			System.out.print("*");
		System.out.println();
		
	}
	}

}
