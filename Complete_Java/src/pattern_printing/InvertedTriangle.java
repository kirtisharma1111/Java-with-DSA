package pattern_printing;
import java.util.Scanner;
public class InvertedTriangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
