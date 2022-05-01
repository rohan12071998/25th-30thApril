package April28th;
public class Stack {
	final int size=6;
	int s[]=new int[size];
	int top=-1;
	
	int push (int data) {
		if(top>=size-1) {
			System.out.println("Stack Overflow");
			return -1;
		}else {
			top++;
			s[top]=data;
			return s[top];
		}
		
	}
	int pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return -1;
		}else {
			int temp=s[top];
			top--;
			return temp;
		}
	}
	int peek() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return -1;
	}else {
		return s[top];
	}
	}
		void display() {
			if(top==-1) {
				System.out.println("Stack Empty");
				return ;
		}else {
			for(int i=0;i<=top;i++) {
				System.out.println(s[i]);
			}
		}
	
	}
}
