package myStuff;

import java.awt.Color;
import java.util.List;

import guiPlayer.CatalogMaker;
import guiPlayer.Cookie;
import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private CatalogMaker catalog;
	private TextField nameField;
	private TextField flavorField;
	private TextField priceField;
	private TextArea textArea;
	private Button add;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	public void initAllObjects(List<Visible> viewObjects) {
		catalog = new CatalogMaker();
		nameField = new TextField(40, 65, 200, 30, "S'mores", "Name");
		flavorField = new TextField(40, 115, 200, 30, "Chocolate", "Flavor");
		priceField = new TextField(40, 165, 200, 30, "5", "Price");
		priceField.setInputType(TextField.INPUT_TYPE_NUMERIC);
		textArea = new TextArea(250, 40, 300, 200, "Text");
		add = new Button(40, 200, 50, 40, "Button", new Action() {
			public void act() {
				addButtonClicked();
			}
		});
		viewObjects.add(nameField);
		viewObjects.add(flavorField);
		viewObjects.add(priceField);
		viewObjects.add(textArea);
		viewObjects.add(add);
		//
		
	}

	protected void addButtonClicked() {
		if(!nameField.getText().equals("") && !flavorField.getText().equals("") && !priceField.getText().equals("")) {
			Cookie c = new Cookie(nameField.getText(), flavorField.getText(), Integer.parseInt(priceField.getText()));
			String s = textArea.getText() + "\n";
			textArea.setText(s);
			catalog.addNewItem(nameField.getText(), flavorField.getText(), Integer.parseInt(priceField.getText()));
			nameField.setText("");
			flavorField.setText("");
			priceField.setText("");
		}else {
			Button.setAccentColor(new Color(255,0,0));
		}
	}

}
