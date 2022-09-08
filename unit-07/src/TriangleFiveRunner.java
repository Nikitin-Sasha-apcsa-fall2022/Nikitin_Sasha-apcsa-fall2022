//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;


public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   char c;
	   int amt;
	   Scanner keyboard = new Scanner(in);
	   c = keyboard.next().charAt(0);
	   amt = keyboard.nextInt();
	   TriangleFive test =new TriangleFive(c, amt);
	   System.out.println(test);
	}
}