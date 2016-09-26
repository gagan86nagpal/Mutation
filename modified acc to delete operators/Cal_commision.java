package classes;

public class Cal_commision {
	public static double get_comm(int locks, int stocks, int barrels){
		double lockPrice, stockPrice, barrelPrice;		
		double lockSales=0.0, stockSales=0.0, barrelSales=0.0;
		double sales=0.0, commision=0.0;
		commision = 0.0;
		if(locks >0 && locks <71 && stocks>0 && stocks<81 && barrels >0 && barrels <91){
			lockPrice = 45.0;
			stockPrice = 30.0;
			barrelPrice = 25.0;			
			lockSales = lockPrice *locks;
			stockSales = stockPrice *stocks;
			barrelSales = barrelPrice *barrels;
			sales = lockSales + stockSales + barrelSales;
			if(sales >1800.0){
				commision = 0.10*1000;
				commision = commision + 0.15*800.0;
				commision = commision + 0.20*(sales-1800.0);
			}
			else if(sales >1000.0){
				commision = 0.10*1000;			
				commision = commision + 0.15*(sales-1000.0); 
			}
			else{
				commision = 0.10*sales;
			}
		}else {
			commision = 0.0; // out of range locks, barrels, stocks
		}
		return commision;
	}
}
			
		