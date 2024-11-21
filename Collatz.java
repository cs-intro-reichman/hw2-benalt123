// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		String ch = args[1];
		for(int i=1 ; i<=num ; i++)
		{
			String str = "" +i;
			int add = i;
			int steps = 1;
			if(add==1)
			{
				add = 4;
				str = str + " " + add;
				steps++;
			}
			while(add!=1)
			{
				if(add%2==0)
					add = add/2;
				else
					add = add*3 + 1;
				str = str + " " + add;
				steps++;

			}
			String str2 = "v";
			if(ch.equals("v"))
				System.out.println(str + "(" + steps + ")");
		}
		System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
	}
}
