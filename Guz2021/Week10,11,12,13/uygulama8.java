package uygulama1;

public class uygulama8 {

	public static void main(String[] args) {
int[][]a= new int [3][4];
int[][]b= new int[5][5];
for (int satir=0; satir<3; satir++)
	for (int sutun=0;sutun<4; sutun++)
		a[satir][sutun]= satir+ sutun;
System.out.println("dizi 1");
for (int satir=0; satir<3; satir++) {
	for(int sutun=0; sutun<4;sutun++)
		System.out.print(a[satir][sutun]+" ");
	System.out.println();
}
System.out.println();
int x =0;
for(int satir=0; satir<5; satir++) {
	for (int sutun=0; sutun<5; sutun++) {
		b[satir][sutun]=x;
		x=1-x;
		
	}
}
System.out.println("dizi 2: ");
for(int satir=0;satir<5;satir++) {
	for (int sutun=0;sutun<5;sutun++)
		System.out.print(b[satir][sutun]+" ");
	System.out.println();
	
}
System.out.println();

	}

}
