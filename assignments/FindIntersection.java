package week1.assignments;

public class FindIntersection {
	public static void main(String[] args) {
		int[] array= {3,2,11,4,6,7}; //Declare An array
		int[] array1={1,2,8,4,9,7}; //Declare An  another array
		for(int i=0;i<array.length;i++) {  //Declare for loop iterator from 0 to array length
			for(int j=0;j<array1.length;j++) {   //Declare a nested for another array from 0 to array length
				if(array[i]==array1[j]) {       //Compare Both the arrays using a condition statement
					System.out.println("Intersection of array is "+array1[i]);  //Print the first array (should match item in both arrays)
				}
			}
		}
		
	}

}
