import java.util.stream.Stream;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {};
      ListNode(int val) { this.val = val; };
      ListNode(int val, ListNode next) { this.val = val; this.next = next; };

      @Override
      public String toString() {
        return "(ListNode" //
            +"(value=" + this.val //
            +"(next=" + this.next //
            +")";
      }
  
 
      public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode ans = new ListNode();
        if (head1 == null && head2 == null)
            return ans;
            if (head1 == null) {
                ans = new ListNode(head2.val);
                head2 = head2.next;
            } else if (head2 == null) {
                ans = new ListNode(head1.val);
                head1 = head1.next;
            } else {
                if (head1.val < head2.val) {
                    ans = new ListNode(head1.val);
                    head1 = head1.next;
                }
                else {
                    ans = new ListNode(head2.val);
                    head2 = head2.next;
                }
            }
         ListNode curr = ans;

        while (head1 != null || head2 != null) {
            if (head1 == null) {
                curr.next = new ListNode(head2.val);
                head2 = head2.next;
            } else if (head2 == null) {
                curr.next = new ListNode(head1.val);
                head1 = head1.next;
            } else {
                if (head1.val < head2.val) {
                    curr.next = new ListNode(head1.val);
                    head1 = head1.next;
                } else {
                    curr.next = new ListNode(head2.val);
                    head2 = head2.next;
                }
            }
            curr = curr.next;
        }
        return ans;
    }

  public static void main(String[] args) {
    ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode result = new ListNode();
    System.out.println("hello");
    System.out.println(result.mergeTwoLists(head1,head2));
    System.out.println(result);
    System.out.println(head1);
    System.out.println("hello");

  
  

  }
}


