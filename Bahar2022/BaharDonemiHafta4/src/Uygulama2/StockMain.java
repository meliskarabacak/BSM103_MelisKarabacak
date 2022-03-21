package Uygulama2;

import java.util.*;

public class StockMain {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Ilk magaza ismi: ");
		String store1 = input.next();
		Stock  stock1 = new Stock(store1);
		int    profit1 = makePurchases(stock1, input);
		
		System.out.print("ikinci magaza ismi: ");
		String store2 = input.next();
		Stock  stock2 = new Stock(store2);
		int    profit2 = makePurchases(stock2, input);
		
		if(profit1> profit2) {
			System.out.println(store1 + " daha yararlidir");
		}
		else if (profit2> profit1) {
			System.out.println(store2 + " daha yararlidir");
		}
		else System.out.println(store1 + "ve "+ store2 + "esittir"); //profit1== profit2
		}
	

public static int makePurchases(Stock currentStock, Scanner input) {
	System.out.print("kac kez satin alma yaptin ");
	int numPurchases = input.nextInt();
	
	for (int i= 1; i<= numPurchases; i++) {
		System.out.print(i + ": alimda kac tane aldin? birim fiyat nedir ");
		int numShares = input.nextInt();
		int pricePerShare = input.nextInt();
		currentStock.purchase(numShares,  pricePerShare);
	}
	System.out.print("guncel birim fiyati: ");
	int currentPrice = input.nextInt();
	
	int profit = currentStock.getProfit(currentPrice);
	System.out.println(" net kazanc/kayip: "+ profit + "TL");
	System.out.println();
	return profit;
	
}}


