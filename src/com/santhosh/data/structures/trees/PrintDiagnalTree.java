package com.santhosh.data.structures.trees;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrintDiagnalTree {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void printDiagnal(Node root) {
		Queue queue = new PriorityQueue<>();
		queue.add(root);
		Node r = root;
		//queue.add(r);
		while (queue != null && !queue.isEmpty()) {
			Node p = (Node) queue.remove();
			if (p == null) {
				queue.add(p);
				p = (Node) queue.remove();
				if (p == null)
					break;
			}
			while (p != null) {
				System.out.println(p.getData());
				if (p.getLeft() != null)
					queue.add(p.left);
				p = p.right;
			}
		}

	}

	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.right.right = new Node(14);
		root.right.right.left = new Node(13);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);

		printDiagnal(root);
	}
}
