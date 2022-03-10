package ButunlemeSinavi;

import java.util.Arrays;

public class MysterySoru {

	
			public static void mystery(int x,int[]y ) {
			x+=2;
			y[x]+=2;
			System.out.println(x+" "+Arrays.toString(y));
			}
			public static void main (String[]args) {
				int x=0;
				int[]y=new int [7];
				x+=2;
				mystery(x,y);
				System.out.println(x+" "+Arrays.toString(y));
				x+=2;
				mystery(x,y);
				System.out.println(x+" "+Arrays.toString(y));
				
			}

		}


	


