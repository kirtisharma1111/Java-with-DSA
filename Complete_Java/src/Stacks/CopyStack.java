package Stacks;
//import java.util.Scanner;
import java.util.Stack;
public class CopyStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
//      Taking input from user
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter no. of elements you want to insert: ");
//		int n = s.nextInt();
//		System.out.print("Enter the elements: ");
//		for(int i=0;i<n;i++) {
//			int x = s.nextInt();
//			st.push(x);
//		}
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		//reverse order
		Stack<Integer> rt = new Stack<>();
		while(!st.isEmpty()) {
			rt.push(st.pop());
		}
		System.out.println(rt);
		//same order
		Stack<Integer> qt = new Stack<>();
		while(!rt.isEmpty()) {
			qt.push(rt.pop());
		}
		System.out.println(qt);
	}

}
