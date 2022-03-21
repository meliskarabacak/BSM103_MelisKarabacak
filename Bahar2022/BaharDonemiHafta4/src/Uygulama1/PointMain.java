package Uygulama1;

public class PointMain {

	public static void main(String[] args) {
		
		
		 Point p1= new Point(7,2);
		Point p2= new Point(4,3);
		
//		p1(7,2) orijine uzakligi
		System.out.println("p1 (" + p1.getX()+ ","+ p1.getY()+")");
		System.out.println("p1"+ p1.toString());
		
		System.out.println("orijine uzakligi: " + p1.distanceFromOrijin());
		

		System.out.println("p2 (" + p2.getX()+ ","+ p2.getY()+")");
		System.out.println("orijine uzakligi: " + p2.distanceFromOrijin());
		
		p1.translate(11,6);
		System.out.println("p1 (" + p1.getX()+ ","+ p1.getY()+")");
		System.out.println("orijine uzakligi: " + p1.distanceFromOrijin());
		
		System.out.println("p1= "+p1); //referans adresini verir
		
		
		
		
		
		
		
		
		
		 
		}

}
