//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("word.dat"));
		String s = "";
		Word test = new Word(s);
		Word test2 = new Word(s);
		Word test3 = new Word(s);
		int size = file.nextInt();
		file.nextLine();
		String[] order = new String[size];
		for(int i = 0; i < size; i++) {
			String sentence = file.nextLine();
			order[i] = new String(sentence);
		}
		for(int k = 0; k<order.length; k++) {
			for(int i = 0; i<order.length; i++) {
				test = new Word(order[i]);
				test2 = new Word(order[k]);
				if(test.compareTo(test2) >= 1) {
					String z = order[i];
					order[i] = order[k];
					order[k] = z;
				}
			}
		}
		
		for(int i = 0; i < order.length; i++) {
			test3 = new Word(order[i]);
			System.out.println(test3);
		}
		
		











	}
}