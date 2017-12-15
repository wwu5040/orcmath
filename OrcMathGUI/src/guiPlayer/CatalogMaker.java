package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {

	private ArrayList<Cookie> list;
	
	public CatalogMaker() {
		list = new ArrayList<Cookie>();
		list.add(new Cookie("Thin Mint", "Mint", 5));
		list.add(new Cookie("Samoas", "Caramel", 4));
		list.add(new Cookie("Tagalongs", "Peanut", 4));
		list.add(new Cookie("Trefoils", "Sugar", 3));
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CatalogMaker instance = new CatalogMaker();
		
		
			System.out.println("Type in 'stop' if you wish to stop, or input another cookie name.");
			String name = in.nextLine();
			System.out.println("What flavor is it?.");
			String flavor = in.nextLine();
			System.out.println("How much does it cost?.");
			String price = in.nextLine();

		
		instance.addNewItem(name, flavor, Integer.parseInt(price));
		System.out.print(instance.getCSVContent());
	}
	
	public String getCSVContent() {
		String data = "Name,Flavor,Price\n";
		for(Cookie c: list) {
			data += c.toString() + "\n";
		}
		return data;
	}
	
	public void addNewItem(String name, String flavor, int price) {
		list.add(new Cookie(name, flavor, price));
		System.out.println("Item added succesfully.");
	}

}
