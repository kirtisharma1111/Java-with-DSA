package Sorting;
public class SelectionSortIncreasingOrder {
	public static void main(String[] args) {
		int[] arr = {10,-4,20,1,-6,8};
		int n = arr.length;
		for(int x=1;x<n;x++) {
			int max = Integer.MIN_VALUE;
			int maxdx = -1;
			for(int i=x;i<n;i++) {
				if(arr[i]>max) {
					max=arr[i];
					maxdx=i;
				}
			}
			//swap arr[x] and arr[maxdx]
			int temp = arr[x];
			arr[x]=arr[maxdx];
			arr[maxdx]=temp;
			}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}

}
