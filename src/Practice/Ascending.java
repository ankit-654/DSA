package Practice;

public class Ascending {

	public static void main(String[] args) {

		
		int arr[]= {3,5,2,1,9};
		int n =arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+ " ");
		}
	}
}
