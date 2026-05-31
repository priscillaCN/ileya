import java.util.Scanner;

public class CheckOutApp {

	public static void main(String[] args) {
			
		ScanneruserInput = new Scanner(System.in);
		
		System.out.println("What is the customer's name?");
		String customerName =userInput.nextLine();
		
		System.out.println("What is your name?");
		String cashierName = userInput.nextLine();
		
		String [] items = new String [999];
		int [] quantityPerItem = new int [999];
		double [] pricePerItem = new double [999];
		
		int count = 0;
		
		while (true) {
			
			System.out.println("Enter item " + (count + 1));
			items[count] =userInput.next();
			
			System.out.println("Enter price");
			pricePerItem[count] =userInput.nextDouble();
			
			System.out.println("Enter quantity");
			quantityPerItem[count] =userInput.nextInt();
			
			System.out.println("Add more items? (yes/no)");
			String answer =userInput.next();
				
				if(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
					
					System.out.println("Invalid answer");
						
					System.out.println("Add more items? (yes/no)");
					answer =userInput.next();
						
				}
						
				if (answer.equalsIgnoreCase("no")) 
					break;
				
			count++;
						
		}
		
		double subTotal = 0;
		
		for(int index = 0; index <= count; index++) {
			
			subTotal += (pricePerItem[index] * quantityPerItem[index]);	
			
		}
		
		double discount = subTotal * 0.10;
		double vat = subTotal * 0.075;
		double billTotal = subTotal - (discount + vat);

		System.out.println("Bill Total = " + billTotal);

		System.out.println("How much did the customer pay?");
		double amountPaid =userInput.nextDouble();
		
		double balance = billTotal - amountPaid;
			
		System.out.println("\nSEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println(""Date: 02-Jun-26 1:57:31 pm"");
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);
		System.out.println("\n=================================================================\n");
		System.out.println("	ITEM		QTY		PRICE		TOTAL(NGN)");
		System.out.println("\n----------------------------------------------------------------\n");
		
		for(int index = 0; index <= count; index++) {
			
			double itemTotal =  pricePerItem[index] * quantityPerItem[index];			
			System.out.printf("%15s %15d %15.2f %15.2f %n", items[index], quantityPerItem[index], pricePerItem[index], itemTotal);
			
		}
		
		System.out.println("\n\n---------------------------------------------------------------\n");
		System.out.printf("%40s %20.2f %n", "Sub Total: ", subTotal);
		System.out.printf("%40s %20.2f %n", "Discount: ", discount);
		System.out.printf("%40s %20.2f %n", "VAT @ 7.50%: ", vat);
	
		System.out.println("\n===============================================================\n");
		System.out.printf("%40s %20.2f %n", "Bill Total: ", billTotal);
		System.out.printf("%40s %20.2f %n", "Amount Paid: ", amountPaid);
		System.out.printf("%40s %20.2f %n", "Balance: ", balance);
		
		System.out.println("\n===============================================================\n");
		System.out.print("\t\tTHANK YOU FOR YOUR PATRONAGE");
		System.out.println("\n===============================================================\n");
			
	}

}
