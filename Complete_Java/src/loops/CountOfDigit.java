package loops;
import java.util.Scanner;
public class CountOfDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter digit: ");
		int n = s.nextInt();
		int count = 0;
		while(n!=0) {
			n/=10;
			count++;
		}
		System.out.print(count);
	}

}
