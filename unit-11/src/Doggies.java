//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		//point pups at a new arry of Dog
		
	}
	
	public void set(int spot, int age, String name)
	{
		if(spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int old = 0;
		for (int i = 0; i<pups.length; i++){
			if (old<pups[i].getAge()) {
				old = pups[i].getAge();
			}
		}
		String check = "";
		for (int i = 0; i<pups.length; i++) {
			if (old == pups[i].getAge()) {
				check = pups[i].getName();
			}
		}
		return check;
	}
	
	
	public String getNameOfYoungest()
	{

		int young = pups[0].getAge();
		for (int i = 0; i<pups.length; i++){
			if (young>pups[i].getAge()) {
				young = pups[i].getAge();
			}
		}
		String check = "";
		for (int i = 0; i<pups.length; i++) {
			if (young == pups[i].getAge()) {
				check = pups[i].getName();
			}
		}
		return check;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}