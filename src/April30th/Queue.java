package April30th;

public class Queue {
	private static int front, rear, capacity;
	private static int queue[];

	Queue(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	static void queueEnqueue(int data) {
		if (capacity == rear) {
			System.out.printf("\nQueue is full\n");
			return;
		}

		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	static void queueDequeue() {
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}

		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}

			if (rear < capacity)
				queue[rear] = 0;

			rear--;
		}
		return;
	}

	static void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}

		for (i = front; i < rear; i++) {
			System.out.printf(" %d <-- ", queue[i]);
		}
		return;
	}

	static void queueFront() {
		if (front == rear) {
			System.out.printf("\nQueue is Empty\n");
			return;
		}
		System.out.printf("\nFront Element is: %d", queue[front]);
		return;
	}
}
class QNode {
  int key;
  QNode next;

  public QNode(int key)
  {
      this.key = key;
      this.next = null;
  }
}
class Queue1 {
  QNode front, rear;

  public Queue1()
  {
      this.front = this.rear = null;
  }

  void enqueue(int key)
  {

      QNode temp = new QNode(key);

      if (this.rear == null) {
          this.front = this.rear = temp;
          return;
      }

      this.rear.next = temp;
      this.rear = temp;
  }

  void dequeue()
  {
      if (this.front == null)
          return;

      QNode temp = this.front;
      this.front = this.front.next;

      if (this.front == null)
          this.rear = null;
  }
}


		
		

