//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] monkey = new int[size];
		for(int i = 0; i< size; i++) {
			monkey[i] = (int) (10*(Math.random())) +1;
		}
		return monkey;
	}
	public static void shiftEm(int[] stuff)
	{
		System.out.println(Arrays.toString(stuff));
		for(int i=0; i< stuff.length-1; i++){
		      int min = i;
		      for(int j = i+1; j<  stuff.length; j++)
		      {
		         if( stuff[j] == 7 )
		            min = j;    		
		      }
		      if(min != i) {
		         int temp = stuff[min];
		         stuff[min] = stuff[i];
		         stuff[i] = temp;   	
		      }
		   }
		System.out.println(Arrays.toString(stuff));
	}
}