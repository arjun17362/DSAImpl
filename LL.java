public class LL {

	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.size = 0;
	}

	public void insertAtFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size += 1;
	}

	public void insertAtLast(int value) {
		Node node = new Node(value);
		if (tail == null) {
			insertAtFirst(value);
		}
		tail.next = node;
		tail = node;
		size += 1;
	}

	public void insert(int value, int index) {
		if (index == 0) {
			insertAtFirst(value);
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(value);
		node.next = temp.next;
		temp.next = node;
		size++;

	}

	public int deleteFirst() {
		int value = head.value;
		if (head == null) {
			tail = null;
		}
		head = head.next;
		size--;
		return value;
	}

	public void deleteLast() {
		Node temp = head;
		int val;
		if (size <= 1) {
			deleteFirst();
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		val = temp.next.value;
		temp.next = null;
		tail = temp;
		size--;
		System.out.println("Last deleted val is " + val);
	}

	public void delete(int index) {
		Node temp = head;
		int val;
		if (index == 0) {
			deleteFirst();
		} else if (index == size - 1) {
			deleteLast();
		} else {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			val = temp.next.value;
			Node next = temp.next.next;
			temp.next = next;
			size--;
			System.out.println("The deleted value is " + val);
		}
	}

	public void display() {

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println("head node is " + head.value);
		System.out.println("tail node is " + tail.value);

	}

	public void size() {
		System.out.println("size is " + size);
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}
}
