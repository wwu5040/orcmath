package myStuff;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiPlayer.CustomLabel;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button implements CustomLabel{

	private String text;
	private int height;
	private int width;

	public CustomButton(int x, int y, int w, int h, String text, java.awt.Color color, Action action) {
		super(x, y, w, h, text, color, action);
		// TODO Auto-generated constructor stub
		this.width = x;
		this.height = y;
		this.text = text;
	}

	@Override
	public void updateString1(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateString2(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIconColor(Color color) {
		// TODO Auto-generated method stub
		
	}
	
	public void drawButton(Graphics2D g, boolean hover){
		g.setColor(Color.BLACK);
		g.drawString(text, width, height);
	}


}
