//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		setString(s);
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		for(int i=0; i<word.length(); i++) {
			back += word.substring(word.length()-1-i, word.length()-i);
		}
		return back;
	}

 	public String toString()
 	{
 		return "" + getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n"
 				+ "";
	}
}