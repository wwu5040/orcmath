package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Cookie extends Component{

	//178, 28
	private String name;
	private int price;
	private String flavor;
	
	public Cookie(String name, String flavor, int price) {
		super(40 , 40, 80, 80);
		this.name = name;
		this.flavor = flavor;
		this.price = price;
		
//		addSequence("resources/Doge.png", 150, 250, 30, 80 , 80, 10);
//		Thread animation = new Thread(this);
//		animation.start();
		update();
	}

	
	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		//super.update(g);
	}
	
	public String toString() {
		return name + "," + flavor + "," + price;
	}
}
