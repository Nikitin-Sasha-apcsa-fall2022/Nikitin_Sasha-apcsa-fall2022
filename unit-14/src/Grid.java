//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int r = 0; r<grid.length; r++) {
			for(int c = 0; c<grid[r].length; c++) {
				grid[r][c] = vals[(int)(Math.random()*vals.length)];
			}
		}
		findMax(vals);
		for(int i = 0; i<vals.length; i++) {
			System.out.println(vals[i] + " count is " + countVals(vals[i]));
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int count = 0;
		int count2 = 0;
		int maxIndex = 0;
		for(int i = 0; i<vals.length-1; i++) {
			for(int r = 0; r<grid.length; r++) {
				for(int c = 0; c<grid[r].length; c++) {
					if(grid[r][c] == vals[i]) {
						count++;
					}
					if(grid[r][c] == vals[i+1]) {
						count2++;
					}
				}
			}
			if(count > count2) {
				String temp = vals[i];
				vals[i] = vals[i+1];
				vals[i+1] = temp;
			}
		}
		return vals[vals.length-1];
		
		
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		
			for(int r = 0; r<grid.length; r++) {
				for(int c = 0; c<grid[r].length; c++) {
					if(grid[r][c] == val) {
						count++;
					}
					
				}
			}
			return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int r = 0; r<grid.length; r++) {
			for(int c = 0; c<grid[r].length; c++) {
				output += " " + grid[r][c];
				if(c==grid[r].length-1) output += "\n";
			}
		}
		return output;
	}
	
}