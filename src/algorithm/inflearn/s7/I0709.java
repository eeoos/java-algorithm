package algorithm.inflearn.s7;

import java.util.*;

public class I0709 {
	
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
		
		System.out.println(DFS(root, 0));
	}
	
	static int DFS(Node root, int L) {
		
		if(root.lt == null && root.rt == null) {
			return L;
		}
		
		return Math.min(DFS(root.lt, L+1), DFS(root.rt, L+1));
	}

}
