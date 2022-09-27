import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		System.out.println(ListOddToEven.go(ray)); 
		
		ArrayList<Integer> ray1;
		ray1 = new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
		System.out.println(ListOddToEven.go(ray1)); 
		
		ArrayList<Integer> ray2;
		ray2 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
		System.out.println(ListOddToEven.go(ray2)); 
		
		ArrayList<Integer> ray3;
		ray3 = new ArrayList<Integer>(Arrays.asList(32767,70,4,5,6,7));
		System.out.println(ListOddToEven.go(ray3)); 
		
		ArrayList<Integer> ray4;
		ray4 = new ArrayList<Integer>(Arrays.asList(2,7,11,21,5,7));
		System.out.println(ListOddToEven.go(ray4)); 

		ArrayList<Integer> ray5;
		ray5 = new ArrayList<Integer>(Arrays.asList(7,255,11,255,100,3,2));
		System.out.println(ListOddToEven.go(ray5)); 
	
	}
}