package loops;
import java.util.Scanner;
public class PrimeAndComposite {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = s.nextInt();
		int x = 0; //x means prime
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				System.out.print("Composite Number");
				x=1;
				break;
			}
		}
		if(n==1) System.out.print("Neither Prime nor Composite");
		else if(x==0) System.out.print("Prime Number");
	}

}
