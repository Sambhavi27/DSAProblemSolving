package arrays;

public class KMaxMin {

	public static void main(String[] args) {
		int arr[]= {7 ,10, 4,3, 20, 15};
		int max=kthMax(arr,0,4, 2) ;
		System.out.println(max);
		
		int min=kthMin(arr,0,4, 2) ;
		System.out.println(min);

	}
	
	static int kthMin(int a[],int l,int r,int k) {
		int part=partition(a,l,r);
		if(part==k-1) {
			return a[part];
		}
		else if(part>k-1) {
			return kthMin(a,l,part-1,k);
		}
		else {
			return kthMin(a,part+1,r,k);
		}
	}
	
	static int kthMax(int a[],int l,int r,int k) {
		int part=partition(a,l,r);
		if(part==a.length-k) {
			return a[part];
		}
		else if(part>a.length-k) {
			return kthMax(a,l,part-1,k);
		}
		else {
			return kthMax(a,part+1,r,k);
		}
	}
	
	static int partition(int a[],int l,int r) {
		int pivot=a[r];
		int loc=l;
		for(int i=l;i<=r;i++) {
			if(a[i]<pivot) {
				int temp=a[i];
				a[i]=a[loc];
				a[loc]=temp;
				loc++;
			}
		}
		int temp=a[r];
		a[r]=a[loc];
		a[loc]=temp;
		return loc;
	}

}
