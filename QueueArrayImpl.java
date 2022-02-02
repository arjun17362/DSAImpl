public class QueueArrayImpl {

	int rear = -1;
	int front = -1;
	int capacity;
	int[] queue;

	QueueArrayImpl(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public int size() {
		return rear - front;
	}

	public void enqueue(int data) {
		if (rear != capacity - 1) {
			queue[++rear] = data;
		}
	}

	public void dequeue() {
		int temp = 0;
		if (isEmpty()) {
			System.out.println("queue is empty");
		}
		temp = queue[++front];
		System.out.println(temp);
	}

	public void display() {
		for (int i = 0; i < size(); i++) {
			System.out.println(queue[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueArrayImpl q = new QueueArrayImpl(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		System.out.println("queue size is " + q.size());
		System.out.println(q.isEmpty());
		q.display();
	}

}
