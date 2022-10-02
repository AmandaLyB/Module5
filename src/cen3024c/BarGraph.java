package cen3024c;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

// BarGraph visually displays the recursive and iterative method times using Canvas 
public class BarGraph extends Canvas {

	public void paint(Graphics g) {
		
		// convert nanoseconds to milliseconds for readability in bar graph
		int recursive = Main.times[0] / 1000;
		int iterative = Main.times[1] / 1000;
		
		// graph labels
		g.setFont(new Font("ComicSans",Font.PLAIN,12));
		g.setColor(Color.black);
		g.drawString("Method Types", 328, 675); // x Axis
		g.drawString("Time in milliseconds", 100, 400); // y Axis
		g.drawString("Fibonacci Sequence Number: " + Main.n, 550, 200);
		g.drawString(String.format("Value: %,d ",Main.iterativeFib(Main.n)), 550, 220);
		g.drawString(recursive + "ms", 300, 150);
		g.drawString(iterative + "ms", 400, 150);
		g.drawString("Recursive", 300, 625);
		g.drawString("Iterative", 405, 625);
		g.drawString(String.format("%,d ns",Main.times[0]), 297, 640);
		g.drawString(String.format("%,d ns",Main.times[1]), 400, 640);
		
		
		// interval resizes bars to fit within 400 pixels regardless of actual size
		double interval = recursive/400.0; 
		
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
		g.fillRect(300, 600, 50, (int) -(recursive/interval));
		g.fillRect(400, 600, 50, (int) -(iterative/interval));		
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("ComicSans",Font.BOLD,18));
		g.drawString("Recursive vs Iterative Methods", 250, 75);
		
		g.dispose();
	}
}
