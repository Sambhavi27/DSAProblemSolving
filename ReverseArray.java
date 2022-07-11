package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int input[]={1,2,3,4,5};
		int res[]=reverse(input);
		for(int i:res)
		System.out.println(i);

	}
	static int[] reverse(int arr[]) {
		int len=(arr.length)/2;
		int j=arr.length-1;
		for(int i=0;i<len;i++) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j--]=temp;
		}
		return arr;
	}

}
