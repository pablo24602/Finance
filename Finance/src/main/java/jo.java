import java.util.*;
public class jo {
    public class ListNode
    {
        public ListNode next;
        public int val;
    }

    public ListNode removeDuplicates(ListNode root)
    {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(root.val);
        ListNode first = root;
        ListNode temp = root.next;
        while (temp!=null)
        {
            if (temp==null)
            {
                first.next=null;
                return root;
            }
            while (ans.contains(temp.val))
            {
                temp=temp.next;
                if (temp==null)
                {
                    first.next=null;
                    return root;
                }
            }
            ans.add(temp.val);
            first.next=temp;
            temp=temp.next;
        }
        return root;
    }


}
