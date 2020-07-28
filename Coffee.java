/*
	This program is intended to display Cozee's
	coffeeshop menu, calculate and display the total amount for
	the customer.
*/
//This package holds the items of the menu
package items;

//The package is separated into classes of different items
public class Coffee {		//classes must be declared public to be accessed by main
	int Espresso, Americano, Cappuccino;	//holds the coffee options

	public Coffee(int E, int A, int C) {	//Coffee constructor 
	 Espresso=E;
	 Americano=A;
	 Cappuccino=C;
	}
	//part of the menu and it contains the order number
	public void FirstMenu() {
	System.out.println("\tCoffee");
	System.out.println(Espresso + " Espresso");
	System.out.println(Americano + " Americano");
	System.out.println(Cappuccino + " Cappuccino");
	}
}
