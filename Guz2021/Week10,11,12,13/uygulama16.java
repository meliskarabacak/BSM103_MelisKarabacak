package uygulama1;

public class uygulama16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= fibonacci (8);
		System.out.println(x);
		
	}
	public static int fibonacci (int n) {
		if ( n<=2)
			return 1;
		else 
			return fibonacci (n-1)+ fibonacci (n-2);

	}

}
