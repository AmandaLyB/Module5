package cen3024c;

import javax.swing.JFrame;


public class Main {

	// change n to see different results
	public static int n = 20;
	public static int[] times;
		
	// recursive method
	static int recursiveFib(int n)
	{
	    if (n <= 1)
	        return n;
	    return recursiveFib(n - 1) + recursiveFib(n - 2);
	}
	
	// iterative method
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
	
	// calculates the processor time in nanoseconds,
	// converts to milliseconds for bar graph,
	// and returns an array of the calculations
	
	public static int[] methodTimes() {
		
		long startTime = System.nanoTime();
		
		System.out.println(recursiveFib(n));
		int recursiveTime = (int)(System.nanoTime()-startTime);
		
		startTime = System.nanoTime();
		System.out.println(iterativeFib(n));
		int iterativeTime = (int)(System.nanoTime()-startTime);
		
		int[] n = {recursiveTime, iterativeTime};
		
		return n;
	}
	
	public static void main(String[] args) {
		
		times = methodTimes();
		BarGraph b = new BarGraph();
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(b);
		f.setSize(800,800);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}
}
