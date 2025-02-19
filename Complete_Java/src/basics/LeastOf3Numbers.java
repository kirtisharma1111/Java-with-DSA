package basics;
import java.util.Scanner;
public class LeastOf3Numbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = s.nextInt();
		System.out.print("Enter b : ");
		int b = s.nextInt();
		System.out.print("Enter c : ");
		int c = s.nextInt();
		if(a<=b && a<=c) System.out.print(a + " is smallest ");
		else if(b<=a && b<=c) System.out.print(b + " is smallest ");
		else System.out.print(c + " is smallest ");
	}

}
