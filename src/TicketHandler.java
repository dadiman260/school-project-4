import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TicketHandler {
	String Name;
	double Price;
		public TicketHandler(String newName,double newPrice) {
			Price = newPrice;
			Name = newName;
		}
		public double payment(int z){
			Scanner input = new Scanner(System.in);
			double g = 0.0;
			Double Paid = 0.0;
			Double x = Price*z;
			while(Paid  < x){
				int l = input.nextInt();
				System.out.println("Amount still to pay :" + x);
				switch(l){
				case 1:
					System.out.println("1p");
					g = 0.01;
					break;
				case 2:
					System.out.println("2p");
					g = 0.02;
					break;
				case 3:
					System.out.println("5p");
					g = 0.05;
					break;
				case 4:
					System.out.println("10p");
					g = 0.10;
					break;
				case 5:
					System.out.println("20p");
					g = 0.20;
					break;
				case 6:
					System.out.println("50p");
					g = 0.50;
					break;
				case 7:
					System.out.println("£1");
					g = 1;
					break;
				case 8:
					System.out.println("£2");
					g = 2;
					break;
				case 9:
					System.out.println("£5");
					g = 5;
					break;
				case 10:
					System.out.println("£10");
					g = 10;
					break;
				case 11:
					System.out.println("£20");
					g = 20;
					break;
				case 12:
					System.out.println("Customer Pays full amount");
					g = x;
					break;


				}
			Paid += g;
			System.out.println("Customer Total :"+ round(Paid,2));
			}
			System.out.println("Price = " + round(x,2) );
			double Change = Paid - x;
			if(Paid>x){
			Paid =- Change;
			}
			System.out.println("Change = " + round(Change, 2) );
			return Paid;
}
		public static double round(double value, int places) {
		    if (places < 0) throw new IllegalArgumentException();

		    BigDecimal bd = new BigDecimal(value);
		    bd = bd.setScale(places, RoundingMode.HALF_UP);
		    return bd.doubleValue();
		}
}
	