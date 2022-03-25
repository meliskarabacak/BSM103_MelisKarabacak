package ArrayListDeneme;

import java.util.ArrayList;

public class deneme {

	public static void main(String[] args) {
		ArrayList<Integer> Spardose1= new ArrayList<>();
		ArrayList<Integer> Spardose2= new ArrayList<>();
		ArrayList<Integer> Spardose3= new ArrayList<>();
		
		ArrayList<String>SpardosenFarbe1= new ArrayList<>();
		ArrayList<String>SpardosenFarbe2= new ArrayList<>();
		ArrayList<String>SpardosenFarbe3= new ArrayList<>();
		
		Spardose1.add(10);
		Spardose2.add(20);
		Spardose3.add(30);
		
		SpardosenFarbe1.add("rot");
		SpardosenFarbe2.add("blau");
		SpardosenFarbe3.add("weiss");
		
		System.out.println("die erste Spardose hat die farbe"+SpardosenFarbe1);
		System.out.println("die zweite Spardose hat die farbe"+ SpardosenFarbe2);
		System.out.println("die dritte Spardose hat die farbe"+ SpardosenFarbe3);
		
		System.out.println("in der ersten spardose werden nur"+ Spardose1+"'er Scheine reingeworfen");
		System.out.println("in der zweiten spardose werden nur"+ Spardose2+"'er Scheine reingeworfen");
		System.out.println("in der dritten spardose werden nur"+ Spardose3+"'er Scheine reingeworfen");
	


	}

}
