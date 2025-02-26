package Arrays;
public class DeepCopyOfArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] brr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[i];
		}
		brr[0]=80;
		System.out.print(arr[0]);

	}

}
