//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.ArrayList;
import java.util.Arrays;

public class SumFirstRunner
{
	public static void main( String args[] )
	{		
		
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
		System.out.println(ListSumFirst.go(ray)); 
		
		ArrayList<Integer> ray1;
		ray1 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListSumFirst.go(ray1)); 
		
		ArrayList<Integer> ray2;
		ray2 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListSumFirst.go(ray2)); 
		
		ArrayList<Integer> ray3;
		ray3 = new ArrayList<Integer>(Arrays.asList(32767));
		System.out.println(ListSumFirst.go(ray3)); 
		
		ArrayList<Integer> ray4;
		ray4 = new ArrayList<Integer>(Arrays.asList(255,255));
		System.out.println(ListSumFirst.go(ray4)); 

		ArrayList<Integer> ray5;
		ray5 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,2));
		System.out.println(ListSumFirst.go(ray5)); 
	}
}