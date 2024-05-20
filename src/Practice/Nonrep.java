package Practice;

public class Nonrep {
	static int nonrepEle(int arr[],int n) {
		for(int i=0;i<n;i++) {
			int j;
			for( j=0;j<n;j++)
				if(i!=j && arr[i]==arr[j])
					break;
				 
				if(j==n)
					return arr[i];
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,4,5,5};
		int n=arr.length;
		System.out.println(nonrepEle(arr,n));
	}
}
