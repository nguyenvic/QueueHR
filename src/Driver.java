
public class Driver {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		//if(q.head.next == null)
			//System.out.printf("%d", q.peek());
			//System.out.println("peek is null");
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.print();
		
		int x = q.remove();
		x = q.remove();
		x = q.remove();
		
		q.print();

	}

}
