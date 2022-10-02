package cen3024c;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

// BarGraph visually displays the recursive and iterative method times using Canvas 

public class BarGraph extends Canvas {

	public void paint(Graphics g) {
		
		// graph labels
		g.drawString("Recursive vs Iterative Methods", 300, 40);
		g.setColor(Color.black);
		g.drawString("Method Types", 350, 725); // x Axis
		g.drawString("Time in milliseconds", 100, 400); // y Axis
		g.drawString(Main.times[0] + "ms", 300, 150);
		g.drawString(Main.times[1] + "ms", 400, 150);
		g.drawString("Recursive", 300, 625);
		g.drawString("Iterative", 405, 625);
		
		// interval resizes bars to fit within 400 pixels regardless of actual size
		double interval = (Main.times[0])/400.0; 
		
		// prints graph interval notation (resized)
		int count = 0;
		for(int i = 0; i <= 20; i++) {
			String l = String.valueOf((int)(interval*i*20));	
			g.drawString(l, 250, 600-(i*20));
			g.fillRect(275, 600-(i*20), 200, 1);
			count++;
		}
		
		// displays each method's time in milliseconds (resized)
		g.setColor(Color.RED);
		g.fillRect(300, 600, 50, (int) -(Main.times[0]/interval));
		g.fillRect(400, 600, 50, (int) -(Main.times[1]/interval));			
	}
}
