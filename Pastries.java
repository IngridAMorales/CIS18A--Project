//This package holds the items of the menu
package items;

//holds the pastry options 
public class Pastries {
	int Croissant, Pie, Muffin;

	public Pastries(int C, int P, int M) {
	 Croissant = C;
	 Pie = P;
	 Muffin = M;
	}
	//last part of the menu and it contains the order number 
	public void ThirdMenu() {
	System.out.println("\tPastry");
	System.out.println(Croissant + " Croissant");
	System.out.println(Pie + " Pie");
	System.out.println(Muffin + " Muffin");
	}
}
