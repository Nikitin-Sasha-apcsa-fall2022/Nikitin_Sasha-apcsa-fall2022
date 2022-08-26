//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {

	   WordsCompare s = new WordsCompare();
		
	   s.setWords ("abe", "ape");
	   s.compare();
	   System.out.println(s.toString());
	   
	   s.setWords ("giraffe", "gorilla");
	   s.compare();
	   System.out.println(s.toString());
	   
	   s.setWords ("fun", "funny");
	   s.compare();
	   System.out.println(s.toString());
	   
	   s.setWords ("123", "19");
	   s.compare();
	   System.out.println(s.toString());
	   
	   s.setWords ("193", "1910");
	   s.compare();
	   System.out.println(s.toString());
	   
	   s.setWords ("goody", "godfather");
	   s.compare();
	   System.out.println(s.toString());
	   
	   
	   s.setWords ("funnel", "fun");
	   s.compare();
	   System.out.println(s.toString());
	   
	   
	   
   }
}