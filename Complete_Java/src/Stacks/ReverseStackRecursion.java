package Stacks;
import java.util.Stack;
public class ReverseStackRecursion {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		displayRev(st);
	}

	private static void displayRev(Stack<Integer> st) {
		if(st.isEmpty()) return;
		int top = st.pop();
		System.out.println(top);
		displayRev(st);
		//for original order** // System.out.println(top);
		st.push(top); //to restore the original stack
	}
}
