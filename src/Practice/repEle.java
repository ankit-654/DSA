package Practice;

public class repEle {
	static int firstRepeatingEle(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] arr= {2,6,4,1,2,3,4,5,3};
		int n =arr.length;
		int index=firstRepeatingEle(arr,n);
		 
	            // Printing the first repeating element and its index
	            System.out.println("First repeating element is " + arr[index]);
	        
}
}
