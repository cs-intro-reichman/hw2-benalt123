// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // Replace this comment with your code
		int times = Integer.parseInt(args[0]);
		int less = 0;
		int more = 0;
		for(int i = 0; i <times; i++)
		{
			double num = Math.random();
			if(num>0.5)
				more++;
			else
				less++;
		}
		System.out.println("> 0.5: " + more + " times ");
		System.out.println("<= 0.5: " + less + " times ");
		if(more>0 && less>0);
		{
			double max = (double) Math.max(more,less);
			double min = (double) Math.min(more,less);
			double ratio = min/max;
			System.out.println("Ratio: " + ratio);
		}
		


	}
}
