//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;


public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
		  
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		for (int i=a/2+1; i>0; i--)
			if (a%i == 0)
				for (int j=b/2+1;j>0;j--)
					if(b%j== 0)
						for (int k =c/2+1; k>0; k--)
							if(c%k ==0)
								if (i==1 && i==j && i==k)
									return 1;
		return 0;
		
		
	}

	public String toString()
	{
		String output="";
for (int a =1; a<=number; a++)
	for(int b =1; b<=number; b++)
		for( int c=1; c<=number; c++)
			if(a*a + b*b == c*c)
					if((a%2==1 && b%2==0) || (a%2==0 && b%2==1))
						if(c%2==1)
							if(greatestCommonFactor(a,b,c)==1)
								if(a<b)
									output += a + " " + b + " " + c + "\n"; 





		return output+"\n";
	}
}