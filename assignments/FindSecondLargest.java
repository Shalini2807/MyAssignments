package week1.assignments;

import java.util.Arrays;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7};
	int length=data.length;
	Arrays.sort(data);   // Arrange the array in ascending order
	for(int i=0;i<length;i++) //Pick the 2nd element from the last and print it
		System.out.println(data[i]);
	    System.out.println(data[3]);
	
}
}
