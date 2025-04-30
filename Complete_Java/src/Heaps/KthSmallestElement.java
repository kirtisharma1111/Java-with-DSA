package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestElement {
	public static void main(String[] args) {
		int[] arr = {10,15,67,-5,14,20,3};
		int k = 3;
		//MaxHeap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int ele:arr) {
			pq.add(ele);
			if(pq.size()>k) pq.remove();
		}
		System.out.println(pq.peek());

	}

}
