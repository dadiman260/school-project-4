import java.io.NotActiveException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class UseTicketMachine {
	public static void main(String[] args) throws ParseException{
		@SuppressWarnings("resource")
		double till_float = 0;

		Scanner scanner = new Scanner(System.in);
		TicketHandler Adult = new TicketHandler("Adult", 10);
		TicketHandler Child = new TicketHandler("Child", 5);
		TicketHandler Student = new TicketHandler("Student", 7);
		TicketHandler OAP = new TicketHandler("OAP", 8);

		ShowType ww2 = new ShowType("ww2", 0);
		ShowType roman = new ShowType("roman", 300);
		ShowType warhole = new ShowType("warhole" ,300);


		Date date2 = new Date();
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.setTime(date2);

		int dd2 = calendar2.get(Calendar.DATE);
		int mm2 = calendar2.get(Calendar.MONTH)+1;
		int yyyy2 = calendar2.get(Calendar.YEAR);

		//System.out.print("date today = " + dd2 + "/");
		//System.out.print(mm2 + "/");
		//System.out.println(yyyy2 + "/");


			while(calendar2.get(Calendar.HOUR_OF_DAY)>=9 && calendar2.get(Calendar.HOUR_OF_DAY)<=17 ){
				Date date = new Date();
				GregorianCalendar calendar = new GregorianCalendar();
				calendar.setTime(date);

				int dd = calendar.get(Calendar.DATE);
				int mm = calendar.get(Calendar.MONTH)+1;
				int yyyy = calendar.get(Calendar.YEAR);
				
				System.out.print("date today = " + dd + "/");
				System.out.print(mm + "/");
				System.out.println(yyyy + "/");

				if(dd>dd2){
					System.out.println("change");
					ww2.pay(300 - ww2.getAmountLeft());
					roman.pay(300 - roman.getAmountLeft());
					roman.pay(300 - roman.getAmountLeft());
				}



				dd2 = dd;
				mm2 = mm;
				yyyy2 = yyyy;
				System.out.println("Please Enter Desired Ticket Type");
				int choice = scanner.nextInt();
				TicketHandler TicketType = null;
				switch (choice) {
				case 1:  
					TicketType = Adult;
					break;
				case 2:  
					TicketType = Child;
					break;
				case 3:  
					TicketType = Student;
					break;
				case 4:  
					TicketType = OAP;
					continue;
				default:
					//Continue if choice isn't correct
					System.out.println( "Incorrect choice, please try again." );
							continue;

				}
				System.out.println("You chose : " + TicketType.Name);
				System.out.println("Please Enter Desired Exhabition");
				int choice2 = scanner.nextInt();
				ShowType f = null;

				switch (choice2){
				case 1:
					f = ww2;
					break;
				case 2:
					f = roman;
					break;
				case 3:
					f = warhole;
					break;
				default:
					//Continue if choice isn't correct
					System.out.println( "Incorrect choice, please try again." );
					continue;
			}
				System.out.println("You chose : " + f.getType());
				System.out.println("Please enter the amount of tickets to purchase");
				int h = scanner.nextInt();
				if(f.getAmountLeft()>0){
				f.pay(h);	
				}
				else{
					System.out.println("Out of Tickets");
					continue;
				}
			    System.out.println("You want to purchase " + h + " tickets");
				System.out.println("Choose the amount given by the customer"+" 1 = 1p"+" 2 = 2p"+" 3 = 5p"+" 4 = 10p"+" 5 = 20p"+" 6 = 50p"+" 7 = £1"+" 8 = £2"+" 9 = £5"+" 10 = £10"+" 11 = $20"+" 12 = Input the amount given by the customer on youur own");
				double paid = TicketType.payment(h);
				System.out.println("The tickets should print promptly thank you for the visit.");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				till_float =+ paid;
				System.out.println("Till Float in this till is now" + till_float);
				
		}
			
	}
	
}
