package Sorting;
public class BubbleSortDescendingOrder {
	public static void main(String[] args) {
		int[] arr = {3,1,2,5,4};
		boolean flag = true; //true means sorted
		int n = arr.length;
		for(int x=1;x<n;x++) {
			for(int i=0;i<n-x;i++) {
				if(arr[i]<arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag = false;
				}
			}
			if(flag==true) break;
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}

	}

}
