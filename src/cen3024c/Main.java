package cen3024c;

import java.awt.Graphics;
import javax.swing.JFrame;


public class Main {

	public static int n = 15;
	public static int[] times;
	
	static Graphics g;
	
	static int recursiveFib(int n)
	{
	    if (n <= 1)
	        return n;
	    return recursiveFib(n - 1) + recursiveFib(n - 2);
	}
	
	static int iterativeFib(int n) {
	    
		int a = 0, b = 1, c, i;
	    
		if(n == 0)
			return a;
	    
		for(i = 2; i <= n; i++) {
	       c = a + b;
	       a = b;
	       b = c;
	    }
	    return b;
	}
		
	public static int[] methodTimes() {
		
		long startTime = System.nanoTime();
		
		System.out.println(recursiveFib(n));
		int recursiveTime = (int)(System.nanoTime()-startTime) / 1000;
		
		startTime = System.nanoTime();
		System.out.println(iterativeFib(n));
		int iterativeTime = (int)(System.nanoTime()-startTime) / 1000;
		
		int[] n = {recursiveTime, iterativeTime};
		
		return n;
	}
	
	public static void main(String[] args) {
		
		times = methodTimes();
		BarGraph b = new BarGraph();
		JFrame f = new JFrame();
		
		f.add(b);
		f.setSize(800,800);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}
}
