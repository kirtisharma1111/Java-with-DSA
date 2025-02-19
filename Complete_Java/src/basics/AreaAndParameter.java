package basics;
import java.util.Scanner;
public class AreaAndParameter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter length : ");
		int length = s.nextInt();
		System.out.print("Enter breadth : ");
		int breadth = s.nextInt();
		int area = length*breadth;
		int perimeter = 2*(length+breadth);
		if(area>perimeter) {
			System.out.print("Area of rectangle is greater and is : " + area);
		}else {
			System.out.print("Perimeter of rectangle is greater and is : " + perimeter);
		}
	}

}
