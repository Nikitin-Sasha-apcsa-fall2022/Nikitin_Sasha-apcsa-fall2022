//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect() {
   number = 0;
   }
   
   public Perfect(int s) {
	   
	   number = s;
   }
   
   
	public boolean isPerfect()
	{
		int sum = 0;
		int i = 1; 
		
		while(i < number/2) {
			if (number % i ==0) {
				sum += i;
				i++;
			}
			else {
				i++;
			}
		}
		if(sum == number) return true;
		else return false;	
		
	
	}

	public String toString() {
		if(isPerfect()==true) return number + " is perfect.";
		
		else return number + " is not perfect.";
	}
			

}