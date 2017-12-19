package myStuff;

import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField nameField;
	private TextField flavorField;
	private TextField priceField;
	private Button add;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		nameField = new TextField(40, 40, 200, 30, "Text Goes Here", "Description");
		flavorField = new TextField(240, 40, 200, 30, "Text Goes Here", "Description");
		priceField = new TextField(440, 40, 200, 30, "Text Goes Here", "Description");
		add = new Button(40, 200, 100, 100, "Button", new Action() {
			public void act() {
				nameField.setText("Button Clicked");
			}
		});
		viewObjects.add(nameField);
		viewObjects.add(flavorField);
		viewObjects.add(priceField);
		viewObjects.add(add);
		
	}

}
