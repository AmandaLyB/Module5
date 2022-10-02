package cen3024c;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class BarGraph extends Canvas {

	public void paint(Graphics g) {
		g.drawString("Recursive vs Iterative Methods", 300, 40);
		
		g.setColor(Color.black);
		g.drawString("Recursive", 300, 625);
		g.drawString("Iterative", 405, 625);
		g.drawString("Method Types", 350, 725);
		g.drawString("Time in milliseconds", 100, 400);
		g.drawString(Main.times[0] + "ms", 300, 150);
		g.drawString(Main.times[1] + "ms", 400, 150);
		
		double interval = (Main.times[0])/400.0; 
		System.out.println(Main.times[0]);
		System.out.println(interval);
		
		int count = 0;
		for(int i = 0; i <= 20; i++) {
			String l = String.valueOf((int)(interval*i*20));	
			g.drawString(l, 250, 600-(i*20));
			g.fillRect(275, 600-(i*20), 200, 1);
			count++;
		}
		
		g.setColor(Color.RED);
		g.fillRect(300, 600, 50, (int) -(Main.times[0]/interval));
		g.fillRect(400, 600, 50, (int) -(Main.times[1]/interval));
		
		System.out.println(-(Main.times[0]/interval));
			
	}
}
