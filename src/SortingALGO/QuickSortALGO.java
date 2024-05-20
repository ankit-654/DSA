package SortingALGO;

public class QuickSortALGO {

	public static void quickSort(int arr[],int low, int high) 
	{
		if(low<high) {
//			pi will be partioning index
			int pi=partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	public static int partition(int arr[],int low,int high) 
	{
		int pivot=arr[high];
		int i=(low-1);
		
		// loop will start to compare pivot from smallest element to  highest
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				// swap i into j
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		 // swap j into next elememt to compare other one
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
	 // print array by using utility function
	
	public static void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
//			System.out.println();
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]= {2,7,4,9,3,5,6,1};
		int n= arr.length;
		quickSort(arr,0,n-1);
		System.out.println("Sorted Array");
		printArray(arr);
	}
}
