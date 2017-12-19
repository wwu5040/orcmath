package guiPlayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
		instance.testSaveContent("test.csv");
		instance.testFileLoading();
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

	private void testSaveContent(String fileName) {
		try{    
			FileWriter fw=new FileWriter(fileName);    
			for(Cookie c: list) {
				fw.write(c + "\n");
			}
			fw.close();    
			System.out.println("Success! File \""+fileName+"\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}
	
	private static void displayContent(List<String> content) {
		//print the content:
		for(String item : content){
			System.out.println(item);
		}
	}
	
	private List<String> testFileLoading() {
		Scanner in = new Scanner(System.in);
		String fileName = "";
		List<String> content = new ArrayList<String>();
		//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename
		boolean opened = false;
		while(!opened){
			try {
				System.out.println("Enter a file to open");
				fileName = in.nextLine();
				FileReader fileReader = new FileReader(new File(fileName));
				String line = "";
				//a BufferedReader enables us to read teh file one line at a time
				BufferedReader br = new BufferedReader(fileReader);
				while ((line = br.readLine()) != null) {
					String[] param = line.split(",");
					list.add(new Cookie("s","s",5));

					/*
					 * useful later:
					 * split only a comma that has an even number of quotes ahead of it
String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
					 */
				}
				br.close();
				opened = true;
			}catch (IOException e) {
				System.out.println("The file name you specified does not exist.");
			}
		}

		//close the Scanner
		in.close();

		return content;

	}



	
}
