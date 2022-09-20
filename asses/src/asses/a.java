public class ethabs
{

    /** 	@param num is a positive non-decimal value
     *  		Precondition : num >= 0 and num has at least 3 digits
     *  	@return true if the sum of the digit divisors in the 3 most significant positions of num is odd 
@return false if the sum of the digit divisors in the 3 most significant positions of num is even
     */
  public static boolean isGoofyB(int num)
  {  
     /* to be implemented in part(a)  */
	  int temp = num;
	  int length = 1;
	  int temp2 = 0;
	  int sum = 0;
	  while(temp>0) {
		 
		 temp = temp/10;
		  if(temp != 0) {
			  length++;
		  }
	  }
	  
	  if(num / 1000 == 0) {
		  return false;
	  }
	  for(int i = 1; i<length; i++) {
		  int multiplier = 10;
		  temp2 = num/((int)pow(multiplier,length-i));
		  temp2 = temp2 % (int)pow(multiplier,i);
		  if(num/temp2 == 0) {
			  sum += temp2;
		  }
		 
	  }
	  if(sum % 1 == 1) {
		  return true;
	  }
	  return false;
  }
  

	
    /* @param count is a positive non-decimal value
     *  		Precondition : count > 0
     *   @return an array containing count Goofy numbers
     */   
  public static int[] getSomeGoofyNumbers(int count)
  {
     /* to be implemented in part(b)  */
	  int[] goofyArray = new int[count];
	  for(int i = count; i>0; i--) {
		  if(isGoofyB(100 + i) == true) {
			  goofyArray[i] = 100 + i;
		  }
		
	  }
	  return goofyArray;
	  
  }	
   
  // There may be variables / fields, constructors, and methods that are not shown.

  public static void main(String args[]) {
		System.out.println("Ethan Scanlon, 2/15/22, Period 1");
		
	}
}