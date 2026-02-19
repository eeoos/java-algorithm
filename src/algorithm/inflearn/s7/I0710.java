package algorithm.inflearn.s7;

import java.util.*;

public class I0710 {
	
	static class Node {
		int data;
		Node lt, rt;
		public Node(int data) {
			this.data = data;
			lt=rt=null;
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		
		BFS(root);
	}
	
	static void BFS(Node root) {
		Deque<Node> dq = new ArrayDeque<>();
		dq.offer(root);
		
		int L = 0;
		while(!dq.isEmpty()) {
			int len = dq.size();
			for(int i =0; i<len; i++) {
				Node cur = dq.poll();
				if(cur.lt == null && cur.rt == null) {
					System.out.println(L);
					return;
				}
				
				if(cur.lt != null) dq.offer(cur.lt);
				if(cur.rt != null) dq.offer(cur.rt);
			}
			L++;
		}
	}
}
