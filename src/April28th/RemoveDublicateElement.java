package April28th;

public class RemoveDublicateElement {

	static Stack s=new Stack();
	public static void main(String[] args) {

        int a[] = {0,0,1,1,2,2,3,4,5,5};


        System.out.println("After Removing Duplicates:"+removeDuplicates(a));
    }

	private static String removeDuplicates(int[] a) {
        for(int i =0;i<a.length;i++)
        {
            if(s.isEmpty())
            {
                s.push(a[i]);
            }

            else {
                int val = s.peek();
                if(val != a[i])
                {
                    s.push(a[i]);
                }
            }
        }
		return s.toString();
	}
}