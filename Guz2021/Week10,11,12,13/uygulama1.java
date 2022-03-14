package uygulama1;
import java.util.*;
public class uygulama1 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
	System.out.print("tam sayi gir");
int n= input.nextInt();
for (int satir= 1; satir<=n; satir++) {
	for (int sutun= 1; sutun<= satir; sutun++)
		System.out.print("*");
		System.out.println();
}
	}

}
