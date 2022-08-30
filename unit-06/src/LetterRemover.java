//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = ' ';
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
 	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	

	public String removeLetters()
	{
		String cleaned = "";
		
		int n = sentence.length();
		int i = 0;
		while (i < n);{
			if (!sentence.substring(i,i+1).equals(""+lookFor)) {
				cleaned += sentence.substring(i,i+1);
			}
			i=i+1;
		}
		return cleaned; 
		
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	
	}
}