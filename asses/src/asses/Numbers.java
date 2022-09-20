package asses;
import java.util.Arrays;

public class Numbers {

public static void main(String[] args) {

int nums_3_gfy[] = getSomeGoofyNumbers(3);
int nums_15_gfy[] = getSomeGoofyNumbers(15);
System.out.println(Arrays.toString(nums_3_gfy));
System.out.println(Arrays.toString(nums_15_gfy));

 

int nums_3_sly[] = getSomeSillyNumbers(3);
int nums_15_sly[] = getSomeSillyNumbers(15);
System.out.println(Arrays.toString(nums_3_sly));
System.out.println(Arrays.toString(nums_15_sly));
}

 

public static boolean isGoofy(int value) {

int sum = 0, v= value;
while (v != 0) {
int r = v % 10;
	if (r != 0 && value % r == 0)
			sum += r;
			v /= 10;
}

if (sum % 2 == 1)
	return true;
else
	return false;
}

public static int[] getSomeGoofyNumbers(int count) {
int c = 0;
int[] nums = new int[count];

for (int i = 1; c < count; i++) {
	if (isGoofy(i)) {
		nums[c] = i;
		c++;
		}

	}

return nums;

}

 

public static boolean isSilly(int value) {

int sum = 0, v = value;
	while (v != 0) {
		int r = v % 10;
			if (r != 0 && value % r == 0)
				sum += r;
			v /= 10;}
	
	if (sum!=0 && sum % 2 == 0)
	return true;
else	
	return false;
}

 

public static int[] getSomeSillyNumbers(int count) {

int c = 0;
int[] nums = new int[count];

for (int i = 1; c < count; i++) {
	if (isSilly(i)) {
		nums[c] = i;
			c++;

		}
	}

		return nums;
	}
}