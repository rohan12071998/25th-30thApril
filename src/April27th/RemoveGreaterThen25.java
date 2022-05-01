package April27th;


public class RemoveGreaterThen25 {
	static DNode head;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addfirst(5);
		Addfirst(10);
		Addfirst(15);
		Addfirst(20);
		Addfirst(25);
		Addfirst(30);
		remove();
		
		Display();

		
	}
private static void remove() {
		// TODO Auto-generated method stub
	int data=15;
	if(head==null) {
		System.out.print("empty");
	}else if(head.right==null) {
		System.out.print("only one element found");
	}else {
		DNode cur=head;
		while(cur!=null) {
			if(cur.data>=data) {
				cur.right=cur.right.right;
				cur.right.right=cur;
				cur=cur.right.right;
			}
			cur=cur.right;
		}
	}
		
	}
public static void Display() {
		
		
		if(head==null) {
			//System.out.println("head is empty");
			return;
		}else {
			DNode cur=head;
			while(cur!=null) {
				System.out.print(cur.data+" ");
				cur=cur.right;
			}
			System.out.println();
		}
	}

	private static void Addfirst(int i) {
		// TODO Auto-generated method stub
		DNode NewNode= new DNode(i);
		if(head==null) {
			head=NewNode;
		}else {
			NewNode.right=head;
			head.left=NewNode;
			head=NewNode;
		}
		
	}
	

}
