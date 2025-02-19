package basics;
import java.util.Scanner;
public class FiveDigitNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = s.nextInt();
		if(n>9999 && n<100000) {
			System.out.print("It's a five digit number");
		}else {
			System.out.print("Not a five digit number");
		}

	}

}
