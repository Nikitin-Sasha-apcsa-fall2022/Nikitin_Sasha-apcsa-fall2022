//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double first = 0.0;
		double second = 0.0;
		double large = 0.0;
		
		if (one >two) first = one; 
		if (two>one) first = two;
		if (three>four) second = three;
		if (four>three) second = four;
		if (first > second) large = first;
		if (second > first) large = second;
		
		return large;
	}
		 

	public String toString()
	{
	   return "";
	}
}