import java.util.Arrays;
import java.util.Scanner;



/*Coding Challenges:
 1. Java :

Given an array of integers, return the largest gap between the sorted elements of the array.

For example, consider the array:
[9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]... in which, after sorting, the array becomes:
<code>[0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]</code>... 
so that we now see that the largest gap in the array is between 9 and 20 which is 11.
*/

public class largestGap {
	
	public static int largestGap(int[] arr) {
        int tempGap=-1;

		int gap = 0;
		for(int i=0; i<9; i++){
            gap = arr[i+1] - arr[i];
            if(gap > tempGap)
            	tempGap = gap;
        }
        return tempGap;
		
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements : ");
		
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Unsorted array elements : ");
		
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("Sorted array elements : ");
		
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Largest gap in array elements is : "+largestGap(arr));
		
	}

}
