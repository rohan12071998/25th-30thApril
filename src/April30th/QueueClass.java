package April30th;

public class QueueClass {
	public static void main (String[]args) {
		Queue q = new Queue(4);

		q.queueDisplay();

		q.queueEnqueue(20);
		q.queueEnqueue(30);
		q.queueEnqueue(40);
		q.queueEnqueue(50);
		q.queueDisplay();

		q.queueEnqueue(60);

		q.queueDisplay();

		q.queueDequeue();
		q.queueDequeue();
		System.out.printf("\nAfter two node deletion\n");
		q.queueDisplay();

		q.queueFront();

		//LinkedList
		Queue1 q1 = new Queue1();
      q1.enqueue(10);
      q1.enqueue(20);
      q1.dequeue();
      q1.dequeue();
      q1.enqueue(30);
      q1.enqueue(40);
      q1.enqueue(50);
      q1.dequeue();
      System.out.println("\nQueue Front : " + q1.front.key);
      System.out.println("Queue Rear : " + q1.rear.key);
	}
} 


