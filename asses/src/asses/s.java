package asses;
import java.util.Arrays;
public class s
{
    public static boolean isSilly(int value)
    {   
        int sum = 0;
        while (value > 0)
        {
            sum = sum + value % 10;
            value = value / 10;
        }
        if (sum%2==0)
            return true;
        else
            return false;
    }

    public static int[] getSomeSillyNumbers(int count)
    {   int[] getSomeSillyNumbers = new int[count];
        int i=0;
        getSomeSillyNumbers[i]=count;
        while(count!=0)
        {            
            if(isSilly(count))
            {
                
                i++;
            }
            count--;
        }
        System.out.println(Arrays.toString(getSomeSillyNumbers));
        return getSomeSillyNumbers;
    }
}


