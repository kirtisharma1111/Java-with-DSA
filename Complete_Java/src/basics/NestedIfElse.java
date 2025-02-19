package basics;
import java.util.Scanner;
public class NestedIfElse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Ram's age : ");
		int ramAge = s.nextInt();
		System.out.print("Enter Shyam's age : ");
		int shyamAge = s.nextInt();
		System.out.print("Enter Ajay's age : ");
        int ajayAge = s.nextInt();
        if(ramAge<shyamAge) {
        	if(ramAge<ajayAge) System.out.print(ramAge +" is youngest");
        	else System.out.print(ajayAge + " is youngest");
        }else{
        	if(shyamAge<ajayAge) System.out.print(shyamAge +" is youngest");
        	else System.out.print(ajayAge +" is youngest");
        }
	}

}
