//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int num;
	private int den; 
	

	public Rational(){
	num = 1;
	den = 1; 
	}

	public Rational(int numerator, int denominator) {
		setNumerator(numerator);
		setDenominator(denominator);
		setRational(numerator, denominator);
	}

	public void setRational( int numerator, int denominator) {
		num = numerator; 
		den = denominator; 
	}
	
	public void setNumerator(int numerator) {
		num = numerator; 
	}
	
	public void setDenominator (int denominator) {
		den = denominator; 
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		
		int newNumerator = num * other.getDenominator() + den * other.getNumerator(); 
		int newDenominator = den * other.getDenominator(); 
		
		setRational(newNumerator, newDenominator);

		reduce();
	}

	private void reduce()
	{
		if	(num != 0) {
			int common = gcd(num, den);
			
			num = num/common; 
			den = den/common; 
		}
			
	}



	private int gcd(int numOne, int numTwo)
	{
		int gcdFinal = 1; 
		for (int i = 1; i<numOne*numTwo; i++) {
			if(numOne % i == 0 && numTwo % i == 0) {
				gcdFinal = i; 
			}
		}
		return gcdFinal; 
	}

	public Object clone ()
	{
		Rational obj = new Rational(num, den);
		return obj; 
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	
	public boolean equals(Rational obj)
	{
		this.reduce();
		obj.reduce();
		
		if(this.getDenominator()==obj.getDenominator() && this.getNumerator()==obj.getNumerator()) {
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		if((double)num/den > (double)other.getNumerator()/other.getDenominator()) return 1;
		if((double)num/den == (double)other.getNumerator()/other.getDenominator()) return 0;
		else return -1;
		
		
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
	
}