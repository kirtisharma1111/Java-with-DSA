package loops;
import java.util.Scanner;
public class TableOfN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = s.nextInt();
		for(int i=n;i<=10*n;i+=n) {
			System.out.print(i+" ");
		}

	}

}
