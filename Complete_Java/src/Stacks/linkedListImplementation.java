package Stacks;
public class linkedListImplementation {
	public static class Node{ //user defined data type
		int val;
		Node next;
		Node(int val){
			this.val = val;
		}
	}
	public static class Stack{ //user defined data structure
		Node head = null;
		int size = 0;
		void push(int x) {
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
			size++;
		}
		int pop() {
			if(head==null) {
				System.out.print("Stack is Empty!");
				return -1;
			}
			int x = head.val;
			head = head.next;
			return x;
		}
		int peek() {
			if(head==null) {
				System.out.print("Stack is Empty!");
				return -1;
			}
			return head.val;
		}
		void displayRecursion(Node h) {
			if(h==null) return;
			displayRecursion(h.next);
			System.out.print(h.val+" ");
		}
		void display() { //recursion
			displayRecursion(head);
			System.out.println();
		}
		void displayreverse() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.val+" ");
				temp = temp.next;
			}
			System.out.println();
		}
		int size() {
			return size;
		}
		boolean isEmpty() {
			if(size==0) return true;
			return false;
		}
	}
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(4);
		st.display();//4
		st.push(5);
		st.display();//4 5 
		st.push(1);
		st.display(); //4 5 1 
		System.out.println(st.size()); //3
		st.pop();
		st.display(); //4 5
		System.out.println(st.size()); //2
		st.push(7);//4 5 7
		st.push(0); //4 5 7 0
	}
}
