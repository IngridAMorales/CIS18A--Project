/*
	This program is intended to display Cozee's
	coffeeshop menu, calculate and display the total amount for
	the customer.
*/
//new package that contains interfaces and where execution begins 
package menu;
import java.util.*;	//this must be imported for the scanner
import items.*;		//imports the previous package to access the items 

//This file holds the interface user 
//it is used in the inner class for the order and checkout 
//holds checkout method 
interface User {
	void checkout();
}
//outer class
public class CoffeeShop {
	public static void main(String args[])
	throws java.io.IOException {
	Coffee ob1= new Coffee(1,2,3);		//creates objects for the imported package
	Other ob2= new Other(4,5,6,7);
	Pastries ob3= new Pastries(8,9,10);
	       
	//display the menu 
	System.out.println("Welcome to Cozee Coffee!");
	System.out.println();
	System.out.println("\t Menu:");
	System.out.println("0 Complete Order and Checkout");
	//insert imported package methods with objects 
	ob1.FirstMenu();
	ob2.SecondMenu();
	ob3.ThirdMenu();
	
	//inner class reads input, performs calculations, and displays the receipt 
	class Order implements User {	//implements the interface User
   		 
		//method from interface User
		public void checkout() {
		Scanner key = new Scanner(System.in);
		
		
		//Variable declaration statements
		int count, choice;
		double total, tax, SalesTax;

	//variable assignment statement 
	double sum = 0;
	
    //an array containing the prices
   double d[]= {0,3.50, 4.25, 4.00, 2.20, 1.25,
	       3.00, 1.00, 5.45, 6.00, 5.00};
	       
	       //variable for the do-while loop
		boolean condition;
			
		//input validation
		do {
		System.out.println("\nHow many items will you order today?");
		 if (key.hasNextInt()) {
			count = key.nextInt();		//scanner
			condition =true;
		 } else {
			System.out.println("\nEnter a whole number. Try again.");
			count=0;
			condition =false;
			key.next();
		 }
		} while(!(condition));

	//repeats based on the input of count 
	for(int i=0;i <= count; i++) {
		
		//input validation. checking input is a whole number 
		do {
		 System.out.println("\nEnter your order number at a time:");
		 System.out.println("(Press 0 to end your order.)");
		 if(key.hasNextInt()) {
			choice = key.nextInt();
		 	condition= true;
		 } else {
		 	System.out.println("\nEnter a whole number. Try again.");
			choice=0;
			condition =false;
			key.next();
			}
		 }while(!(condition));	 
		
		 //terminates the for loop if user inputs 0 
		 if(choice==0){
		 	System.out.println("End of order.");
		 	break;
		 	}
		 	
		 //input validation for order number 
		 while (choice <0 || choice >10) {
			System.out.println("That is not a valid order number. Try again.");
			choice = key.nextInt();
			}
			
			//menu choice 
		switch (choice) {
			 case 1:
			 	System.out.println("\nYou ordered an Espresso.");
				System.out.print("Cost $");				//no new line after 
				System.out.format("%.2f",d[choice]);	//shows the tailing zeroes  
			  break;
			 case 2:
			 	System.out.println("\nYou ordered an Americano.");
				System.out.print("Cost $");
				System.out.format("%.2f",d[choice]);	//fixes the array to two decimal points 
				break;
			 case 3:
			 	System.out.println("\nYou ordered a Cappuccino.");
				System.out.print("Cost $");
				System.out.format("%.2f",d[choice]);	//fixes the array to two decimal points 
				break;
			 case 4:
			 	System.out.println("\nYou ordered Hot Chocolate.");
				System.out.print("Cost $");
				System.out.format("%.2f",d[choice]);	//fixes the array to two decimal points 
				break;
			 case 5:
			 	System.out.println("\nYou ordered Tea.");
				System.out.print("Cost $");
				System.out.format("%.2f",d[choice]);	//fixes the array to two decimal points 
				break;
			 case 6:
			 	System.out.println("\nYou ordered Iced Coffee.");
				System.out.print("Cost $");
				System.out.format("%.2f",d[choice]);	//fixes the array to two decimal points 
				break;
			 case 7:
			 	System.out.println("\nYou ordered Cold Milk.");
        System.out.print("Cost $");
        System.out.format("%.2f",d[choice]);
				break;
			 case 8:
			 	System.out.println("\nYou ordered a Croissant.");
        System.out.print("Cost $");
        System.out.format("%.2f",d[choice]);	//fixes the array to two decimal points 
				break;
			 case 9:
			 	System.out.println("\nYou ordered a Pie.");
        System.out.print("Cost $");
        System.out.format("%.2f",d[choice]);	//fixes the array to two decimal points 
				break;
			 case 10:
			 	System.out.println("\nYou ordered a Muffin.");
        System.out.print("Cost $");
        System.out.format("%.2f",d[choice]);	//fixes the array to two decimal points 
				break;
			}
			//add the choices together
			sum += d[choice];
		}   //end of for loop
		//rounds the number to two decimal places 
		String FixedSum = String.format("%.2f",sum);
		//output receipt
		System.out.println("\nSubtotal \t$"+FixedSum);
		
		//tax in Moreno Valley location 
		tax = 0.0775;
		SalesTax = tax*sum;
		//rounds the sales tax to two decimal places 
		String FixedSTax = String.format("%.2f",SalesTax);
		System.out.println("Sales Tax \t$"+FixedSTax);
		
		total= SalesTax + sum;
		//rounds the total to two decimal places 
		String FixedTotal = String.format("%.2f",total);		
		System.out.println("Total \t\t$"+FixedTotal);

		System.out.println("Thank you for your order");
		System.out.println("Your order will be out shortly.");
			}
		} 
		//the inner class method is called in main 
		Order in = new Order();	//object for inner class 
		in.checkout();
	}
}
