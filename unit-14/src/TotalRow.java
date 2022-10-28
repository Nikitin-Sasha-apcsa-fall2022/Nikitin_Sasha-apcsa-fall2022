//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int count = 0;
    	ArrayList<Integer> dog = new ArrayList<Integer>();
		for(int r = 0; r < m.length; r++) {
			for(int c = 0; c<m[r].length; c++) {
				count += m[r][c];
			}
			dog.add(count);
			count = 0;
		}
		return dog;
    }
}
