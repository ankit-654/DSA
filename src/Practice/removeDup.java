package Practice;

import java.util.Arrays;

public class removeDup {

	static int removeDups(int arr[]) {
		int rd=0;
		  for(int i=1;i<arr.length;i++) 
		  {
				  if(arr[rd]!=arr[i])
				  {
					  rd++;
					  arr[rd]=arr[i];
				  }
		  }
		return rd+1;
	}
	public static void main(String[] args) {	
//		int [] arr= {1,2,2,3,4,5,5,1,3,2,3,1,3,1};
//		int n =arr.length;
//		Arrays.sort(arr);
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]);
//		}
//		System.out.println();
//		int rd=removeDups(arr);
//		for(int i=0;i<rd;i++) {
//			System.out.print(arr[i]+" ");	
//		}

		String str="Ankit anand";
		char [] c=str.toCharArray();
		Arrays.sort(c);
		System.out.print(Arrays.toString(c)+" ");
		
	}

}
