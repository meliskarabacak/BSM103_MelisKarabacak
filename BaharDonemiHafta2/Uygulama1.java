package BaharDonemiHafta2;

public class Uygulama1 {

	public static void main(String[] args) {
	
		int[]A= {{1,3,4},{2,4,3},{3,4,5}};
		int[]B= {{1,3,4},{2,4,3},{1,2,4}};
		System.out.print(matrixAdd(A,B));
	}

		public static int[][]matrixAdd(int[][]A,int B){ 
			int rows =A.length;
			int cols= 0;
			if(rows>0) {
				cols=A[0].length;
			}
			int[][]c=new int [rows][cols];
			
			for(int satir=0; satir<rows;satir++) {
				for(int sutun=0;sutun<cols; sutun++) {
					c[satir][sutun]=A[satir][sutun]+B[satir][sutun];
				}
			}
			return c;

		}

	}
	
