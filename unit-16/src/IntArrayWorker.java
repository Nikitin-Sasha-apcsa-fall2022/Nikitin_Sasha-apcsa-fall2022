public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /*returns the count of the number of times a passed integer value is found in the matrix.*/
  public int getCount(int value) {
	  int z = 0; 
	  for(int r = 0; r < matrix.length; r++) {
		  for(int c = 0; c < matrix[0].length; c++) {
			  if(matrix[r][c] == value) {
				 z++; 
			  }
		  }
	  }
	  return z; 
  }
  
  /*that returns the largest value in the matrix.*/
  public int getLargest() {
	  int max = matrix[0][0];
	  for(int r = 0; r < matrix.length; r++) {
		  for(int c = 0; c < matrix[0].length; c++) {
			  if(matrix[r][c] > max) {
				  max = matrix[r][c];
			  }
		  }
	  }
	  return max;
  }
  
  /*that returns the total of all integers in a specified column.*/
  public int getColTotal(int col) {
	  int sum = 0; 
	  for(int i=0; i< matrix.length; i++) {
		  sum+=matrix[i][col];
	  }
	  return sum; 
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
}