package April28th;

public class StackClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		s.display();
		System.out.println("peak= "+s.peek());
		
		s.pop();
		s.display();
		

	}

	

}
