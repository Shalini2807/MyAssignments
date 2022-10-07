package week1.assignments;

public class PrintDuplicatesInArray {
public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int Length=arr.length; 	// get the length of the array
	int count; 		// declare an int variable named count
	for (count=0;count<Length-1;count++)  // iterate from 0 to the array length-1 (outer loop starts here)
		for(int i=count+1;i<Length;i++)  // iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			if(arr[count]==arr[i]) {
				System.out.println("The Duplicate Array is" + arr[count]); 			// Out of the inner loop, check and print the first array variable if count is more than 0
			}

}

}
