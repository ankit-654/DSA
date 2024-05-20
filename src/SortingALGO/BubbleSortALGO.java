package SortingALGO;

public class BubbleSortALGO {
	
	public static void bubbleSort(int arr[],int n) {
		 boolean swapped;
		 for(int i=0;i<n-1;i++) 
		 {
			 swapped=false;
			 for(int j=0;j<n-1-i;j++)
			 {
				 if(arr[j]>arr[j+1]) 
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 swapped=true;
				 }
			 }
			 if(!swapped) break;
		 }
	}
	public static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,4,3,5,1,6,8,7};
		int n=arr.length;
		bubbleSort(arr,n);
		System.out.println();
		printArray(arr,n);
	}
}
