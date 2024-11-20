// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) 
        {
	    // Replace this comment with your code
            String str = args[0];
            int num = Integer.parseInt(args[1]);
            int length = str.length();
            char[] notobe = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
            for(int i = 0; i<length; i++)
            {
                boolean dif=false;
                for(int j=0; j<notobe.length && !dif ; j++)
                        dif = (str.charAt(i) == notobe[j]);
                if(dif)
                        System.out.println("Give me an " + str.charAt(i) + ": " + str.charAt(i) + "!");
                else
                        System.out.println("Give me a " + str.charAt(i) + ": " + str.charAt(i) + "!");         
            }
            System.out.println("What does that spell? ");
            for(int n=0; n<num; n++)
                System.out.println(str + "!!!");

        }
}
