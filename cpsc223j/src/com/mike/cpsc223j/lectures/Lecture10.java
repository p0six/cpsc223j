package com.mike.cpsc223j.lectures;

public class Lecture10 {
	public static void main(String[] args) {
		
	}
	
	public static void insertCircularLinkedList(int n) {
		//p = list.queue;
		//while (p.next != null) {
		//	p = p.next;
		//}
		//p.next = list;
		
	}
	/* 
	public static void displayCircularLinkedList(LinkedList list) {
		node p = list.queue;
		do {
			System.out.println(p.info + "->");
			p = p.next;
		} while (p != list.queue);
	}
	public void insertDoubleLinkedList(int val) {
		nodeDoubleLinkedList p = new nodeDoubleLinkedList(val);
		if (list == null) {
			list = p;
		} else {
			p.next = queue;
			queue.back = p;
			queue = p;
		}
	}
	
	public void displayCircularDoublyLinkedListLtoR(LinkedList list) {
		p = list.queue;
		do {
			System.out.print(p.info + "->");
			p = p.next;
		} while (p != list);
	}
	public void displayCircularDoublyLinkedListRtoL() {
		p = list.back;
		do {
			System.out.print(p.info + "->");
			p = p.back;
		} while (p != list.back);
	}
	*/
	
	// Binary Search Tree (BST)
	/*
	 * class BST {
	 *   private struct node {
	 *     int info; node left; node right;
	 *   };
	 *    
	 * }
	 * 
	 * void insert(node& p, int val) {
	 *   if (p == null) {
	 *     p->info = val; p->left = p->right = null;
	 *   } else {
	 *     if (val < p.info) {
	 *       insert(p->left, val);
	 *     } else if (val > p.info) {
	 *       insert(p->right, val); // what about if val = p.info ?... 
	 *     }
	 *   }
	 * }
	 * 
	 * void display(node* p) { // C++ code reminder on BST display algo
	 *   // p is the root
	 *   // inOrder, preOrder, postOrder traversal
	 *   // preOrder = visit Parent, visit Left, visit Right // +ab	:  prefix
	 *   // inOrder = visit left, visit Parent, visit Right // a+b	: infix
	 *   // postOrder = visit right, visit Parent, visit left // ab+ : postfix
	 *   // apply inOrder traversal
	 *   // (lc)(p)(rc) // left child, parent, right child
	 *   if (p != null) {
	 *     display(p->left);
	 *     cout << p->info;
	 *     display(p->right);
	 *   }
	 * }
	 * 
	 * void insert(int val) {
	 *   insert(root, val); 
	 * }
	 * void display() {
	 *   display(root);
	 * }
	 * 
	 *  int main() {
	 *    BST t;
	 *    int a[5] = {9,3,7,8,11};
	 *    for (int i = 0; i < 5; ++i) {
	 *      t.insert(a[i]);
	 *    }
	 *    // display BST in order
	 *    t.display();
	 *  }
	 *
	 *
	 * --  Java Implementation
	 * class node {
	 *   int info; node left; node right;
	 *   public node(int val) { info = val; left = right = null; }
	 * }
	 * public class BST {
	 *   node root;
	 *   public BST() { root = null; }
	 * }
	 *
	 * public void insert (int val) {
	 *   node p = new node(val);
	 *   if (root == null) {
	 *     root = p; return;
	 *   } 
	 *   node current = root;
	 *   node parent = null;
	 *   while (true) {
	 *     parent = current;
	 *     if (val < current.info) {
	 *       current = current.left;
	 *       if (current == null) { parent.left = p; return; }
	 *     } else {
	 *       current = current.right;
	 *       if (current == null) {
	 *         parent.right = p; return;
	 *       }
	 *     }
	 *   }
	 * } 
	 *
	 * public void displayInOrder(node p) {
	 *   if (p != null) {
	 *     displayInOrder(p.left);
	 *     System.out.print(p.info + "->");
	 *     displayInOrder(p.right);
	 *   }
	 * }
	 *
	 * public static void main(String[] args) {
	 *   BST mytree = new BST();
	 *   int[] a = {9,5,7,18,10};
	 *   for (int i = 0; i < 5; i++) {
	 *     mytree.insert(a[i]);
	 *   }
	 *   mytree.display(mytree.root);
	 *   System.out.println("# of nodes = " + countNodes(mytree.root));
	 *   mytree.displaySideway(mytree.root, 0);
	 *   int h = countHeight(mytree.root); 
	 * }
	 * 
	 *- count the # of nodes
	 * public int countNodes(node p) {
	 *   if (p == null) {
	 *     return 0;
	 *   } else {
	 *     return 1 + countNodes(p.left) + coundNodes(p.right);
	 *   }
	 * }
	 * 
	 * public void displaySideway(node p, int s) {
	 *   if (p != null) {
	 *     displaySideway(p.right, s += 5);
	 *     for (int i = 1; i <= s; ++i) {
	 *       System.out.print(" ");
	 *     } 
	 *     System.out.println(p.info);
	 *     displaySideway(p.left, s);
	 *   }
	 * }
	 * 
	 * public int max(int a, int b) {
	 *   return (a>b)?a:b;
	 * }
	 * 
	 * public int countHeight(node p) {
	 *   if (p == null) {
	 *     return 0;
	 *   } else {
	 *     return 1 + max(countHeight(p.left), countHeight(p.right));
	 *   }
	 *   
	 * }
	 * 
	 */
	
	 
}
