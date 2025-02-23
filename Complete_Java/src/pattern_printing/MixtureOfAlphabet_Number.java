package pattern_printing;
import java.util.Scanner;
public class MixtureOfAlphabet_Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = s.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) System.out.print((char)(j+64)+" ");
				else System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
