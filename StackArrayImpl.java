public class StackArrayImpl {

	int top = -1;
	int capacity;
	int[] stack;

	StackArrayImpl(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public void push(int data) {
		if (!isFull()) {
			stack[++top] = data;
		} else {
			System.out.println("Stack is full");
		}
	}

	public void pop() {
		int temp = 0;
		if (!isEmpty()) {
			temp = stack[top--];
			System.out.println(temp);
		} else {
			System.out.println("Stack is empty");
		}
	}

	public void peek() {
		if (!isEmpty()) {
			System.out.println(stack[top]);
		} else {
			System.out.println("there is no element in stack");
		}
	}

	public void display() {
		for (int i = top; i > -1; i--) {
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArrayImpl s = new StackArrayImpl(4);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		s.peek();
		System.out.println("remaining elements in stack ");
		s.display();
	}

}
