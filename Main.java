public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LL l = new LL();
		l.insertAtFirst(10);
		l.insertAtFirst(20);
		l.insertAtFirst(30);
		l.insertAtLast(40);
		l.insert(50, 2);
		System.out.println("deleted val is " + l.deleteFirst());
		l.deleteLast();
		l.delete(2);
		l.size();
		System.out.println("The node are");
		l.display();

	}

}
