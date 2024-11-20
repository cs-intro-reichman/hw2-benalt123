// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double sum = 0;
		double add = 1;
		for(int i=0; i<num; i++)
		{
			if(i%2!=0)
				sum = sum -(1/add);
			else
				sum = sum + (1/add);
			add+=2;

		}
		double newN = sum*4;
		System.out.println("pi according to Java: " +Math.PI);
		System.out.println("pi, approximated: " + newN);
	}
}
