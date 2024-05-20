package Practice;

public class BinartSearch {
  int binarySearch(int arr[], int first,int last,int tar) {
	while(first<=last) {
		 int mid=(first+last)/2;
		  if (arr[mid]==tar) {
			  return mid;
		  }
		  else if(arr[mid]>tar) {
			  last=mid-1;
		  }
		  else {
			  first=mid+1;
		  }
	}
	  
	  return -1;
 }
	public static void main(String[] args) {
		BinartSearch ob=new BinartSearch();
		int arr[]= {60,80,180,240,400};
		int n =arr.length;
		int tar=60;
		int result=ob.binarySearch(arr,0,n-1,tar);
		if(result==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at index "+result);
		}
	}
}
