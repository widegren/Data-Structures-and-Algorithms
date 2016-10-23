package GFG;

import java.util.Scanner;

public class Add_LinkedList {
	Node head;

	void printList(Node head) {
		while (head != null) {
			System.out.print(head.intdata + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	Node reverse(Node head, int k) {
		Node tmp = head, tmp_next = null, tmp_prev = null;
		int i = 0;
		while (tmp != null && i < k) {
			tmp_next = tmp.next;
			tmp.next = tmp_prev;
			tmp_prev = tmp;
			tmp = tmp_next;
			i++;
		}
		if (tmp_next != null){
			head.next = reverse(tmp_next, k);
		}
		return tmp_prev;
	}

	void merge(Add_LinkedList q) {
		Node p_curr = head, q_curr = q.head;
		Node p_next, q_next;

		while (p_curr != null && q_curr != null) {
			p_next = p_curr.next;
			q_next = q_curr.next;

			q_curr.next = p_next;
			p_curr.next = q_curr;

			p_curr = p_next;
			q_curr = q_next;
		}
		q.head = q_curr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int n1 = sc.nextInt();
			Add_LinkedList list1 = new Add_LinkedList();
			for (int i = 1; i <= n1; i++) {
				int a = sc.nextInt();
				list1.push(a);
			}

			int n2 = sc.nextInt();
			Add_LinkedList list2 = new Add_LinkedList();
			for (int i = 0; i < n2; i++) {
				int b = sc.nextInt();
				list2.push(b);
			}

			Add_LinkedList list3 = new Add_LinkedList();
			GfG g = new GfG();
			Node rs = g.addTwoLists(list1.head, list2.head);
			list3.printList(rs);
			System.out.println();
			T--;
		}
		sc.close();
	}
}