//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		   StringEquality s = new StringEquality();
		   s.setWords ("hello", "goodbye");
		   s.checkEquality();
		   System.out.println(s.toString());
		   
		   s.setWords ("one", "two");
		   s.checkEquality();
		   System.out.println(s.toString());
		   
		   s.setWords ("ABC", "ABC");
		   s.checkEquality();
		   System.out.println(s.toString());
	}
}