package April27th;


public class SizeOfDLinkedList {
	static DNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addfirst(5);
		Addfirst(10);
		Addfirst(15);
		Addfirst(20);
		Addfirst(25);
		Addfirst(30);
		AddLast(100);
		System.out.println("size= "+size());
		Display();

		
	}private static int size() {
		// TODO Auto-generated method stub
		int size=0;
		if(head==null) {
			System.out.println( head);
		}else {
			DNode cur=head;
			while(cur!=null) {
				cur=cur.right;
				size++;
			}
		}
		return size;
	}	

private static void AddLast(int i) {
		// TODO Auto-generated method stub
	DNode NewNode= new DNode(i);
	if(head==null) {
		return;
		
	}else {
		DNode cur=head;
		while(cur.right!=null) {
			cur=cur.right;
		}
		cur.right=NewNode;
		NewNode.left=cur;
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
