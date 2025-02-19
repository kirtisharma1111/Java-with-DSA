package basics;
import java.util.Scanner;
public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = s.nextInt();
		if(n % 5 == 0) {
			System.out.print("Divisible by 5");
		}else {
			System.out.print("Not Divisible by 5");
		}
	}

}
