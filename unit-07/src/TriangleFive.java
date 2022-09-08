//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;


public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = ' ';
		amount= 0;
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt; 
	}

	public void setLetter(char c)
	{
		letter = c; 
	}

	public void setAmount(int amt)
	{
		amount = amt; 
	}

	public String toString()
	{
		String output="";
		for(int a = 0; a < amount; a++) {
			output += "\n";
			int count =amount + 1;
			for(char i = letter; i<amount + letter -a; i++) { 
				count--;
				for(int j = count; j>0; j--) {
					char temp = i;
					if(temp>90) temp = (char) (temp-26);
						
					
						if(j==1) output += temp + " ";
						else output += temp;
					}
				}
			}
		
			return output;
		}
}