//This package holds the items of the menu
package items;

//holds the other type of drinks in the coffee shop
public class Other {
	int Chocolate, Tea, Iced, Milk;

	public Other(int C, int T, int I, int M) {
	 Chocolate = C;
	 Tea = T;
	 Iced = I;
	 Milk = M;
	}
	//second part of the menu and it contains the order number
	public void SecondMenu() {
	System.out.println("\tOther Drinks");
	System.out.println(Chocolate + " Hot Chocolate");
	System.out.println(Tea + " Tea");
	System.out.println(Iced + " Iced Coffee");
	System.out.println(Milk + " Cold Milk");
	}
}
