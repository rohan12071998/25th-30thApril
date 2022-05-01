package April26th;

public class IntersectionOfTwoLinkedList {
	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1=new Node (4);
		head1.next=new Node (1);
		head1.next.next=new Node (8);
		head1.next.next.next=new Node (4);
		head1.next.next.next.next=new Node (5);
		display(head1);
		
		Node head2=new Node (5);
		head2.next=new Node (6);
		head2.next.next=new Node (1);
		head2.next.next.next=new Node (8);
		head2.next.next.next.next=new Node (4);
		head2.next.next.next.next.next=new Node (5);
		display(head2);
		
		Node intersect=Intersection(head1,head2);
		display(intersect);
	}
	private static Node Intersection(Node head1, Node head2) {
		// TODO Auto-generated method stub
		if(head1==null) {
			System.out.print("empty");
			
		}else {
			Node cur=head1;
			Node cur2=head2;
			while(head1!=null) {
				cur=cur.next;
				while(head2!=null) {
					cur2=cur2.next;
					if(cur.data==cur2.data) {
						System.out.println("Point from which both are intersecting is = "+cur.data);
						return cur;
					}
				}
			}
			
		}
		return null;
	}
	public static void display(Node head) {
		if(head==null) {
			return;
		}else {
			Node cur=head;
			while(cur!=null) {
				System.out.print(cur.data+" ");
				cur=cur.next;
			}
			System.out.println();
		}
	}



}
