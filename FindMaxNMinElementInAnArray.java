package arrays;

public class FindMaxNMinElementInAnArray {

	public static void main(String[] args) {
		int input[]= {23,1,45,22,56,34,23,1,9};
		maxMin(input);
	}
	
	static void maxMin(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=min) {
				min=arr[i];
			}
			if(arr[i]>=max) {
				max=arr[i];
			}
		}
		System.out.println("MAXIMUM = "+max);
		System.out.println("MINIMUM = "+min);
	}

}
