package TwoDimensionalArrays;
public class Waveform1 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int m = arr.length,n = arr[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<m;i++) {
			if(i%2==0) {
				for(int j=n-1;j>=0;j--){
					System.out.print(arr[i][j]+" ");
				}
			}else {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
//			System.out.println();
		}

	}

}
