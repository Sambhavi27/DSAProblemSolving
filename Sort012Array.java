package arrays;

public class Sort012Array {

	public static void main(String[] args) {
		int arr[]= {0, 2, 1, 2, 0};
		sort012(arr,5);
		for(int i:arr)
		System.out.println(i);

	}
	static void sort012(int a[],int n) {
		int ptr0=0;
        int ptr1=0;
        int ptr2=n-1;
        while(ptr1<=ptr2){
            switch(a[ptr1]){
                case 0:int temp=a[ptr0];
                       a[ptr0]=a[ptr1];
                       a[ptr1]=temp;
                       ptr0++;
                       ptr1++;
                       break;
                case 1:ptr1++;
                       break;
                case 2:temp=a[ptr1];
                       a[ptr1]=a[ptr2];
                       a[ptr2]=temp;
                       ptr2--;
                       break;
            }
        }
    }

}
