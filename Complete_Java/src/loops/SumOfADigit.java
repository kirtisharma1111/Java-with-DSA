package loops;
import java.util.Scanner;
public class SumOfADigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter digit : ");
		int n = s.nextInt();
		int sum = 0;
		while(n!=0) {
			int lastDigit = n%10;
			sum += lastDigit;
			n/=10;
		}
		System.out.print(sum);
	}

}
