package BaharDonemiHafta2;

public class Uygulama5 {

	public static void main(String[] args) {
		writeBinary(12);
		}
	public static void writeBinary (int n) {
		if (n<0) {
			throw new IllegalArgumentException();
		}
		if (n>=2) {
			writeBinary(n/2);
		}
	    System.out.print(n%2);
	}

	}


