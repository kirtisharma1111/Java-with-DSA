package Arrays;
public class SecondMaxElement {
	public static void main(String[] args) {
		int[] arr = {10,20,25,48,98,112,196,254,628,556};
		int n = arr.length;
		int mx = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			mx = Math.max(mx, arr[i]);
		}
		int smx = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]!=mx) smx =Math.max(smx, arr[i]);
		}
		System.out.print(smx);

	}

}
