package Practice;

public class highest {

	public static void main(String[] args) {
		int arr[]= {9,2,4,3,7};
		int n =arr.length;
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
			  max=arr[i];
			}
		}
		System.out.println(max);
	}
}
