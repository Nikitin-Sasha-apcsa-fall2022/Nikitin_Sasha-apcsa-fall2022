//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover s = new LetterRemover();
		s.setRemover("I am Sam I am" , 'a');
		System.out.println(s);
		
		s.setRemover("ssssssssxssssesssssesss" , 's');
		System.out.println(s);

		
		s.setRemover("qwertyqwertyqwerty" , 's');
		System.out.println(s);


		s.setRemover("abababababa" , 's');
		System.out.println(s);


		s.setRemover("abaababababa" , 's');
		System.out.println(s);



		


											
	}
}