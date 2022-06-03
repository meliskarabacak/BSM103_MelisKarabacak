package Uygulama;
import java.util.*;
import java.util.function.*;
public class MathTutor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		giveProblems(input, 3,"*",(x,y)-> x*y);

	}
	
	public static void giveProblems(Scanner input,int numProblems,String text, IntBinaryOperator operator) {
		
	Random r = new Random();
	int numRight=0;
	for(int i=0; i<numProblems;i++);
	int x= r.nextInt(12)+1;
	int y= r.nextInt(12)+1;
	System.out.println(x+ ""+ text + ""+ y+ "=");
	int answer= operator.applyAsInt(x,y);
	int response= input.nextInt();
	if(response ==answer) {
		System.out.println("dogru");
		numRight++;
	}
	else { 
		System.out.println(" yanlis cevap:"+ answer);
	}
	System.out.println(numProblems+ "cevaptan dogru sayisi "+ numRight);
	}}


