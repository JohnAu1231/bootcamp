public class Node {
  
  private String str; // object referenece

  private Node next; // object referenece

  public Node(String str) {
    this.str = str;
  }

  public Node(String str, Node next) {
    this.str = str;
    this.next = next;
  }

  public void setNode(Node next) {
    this.next = next;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public String getStr() {
    return this.str;
  }

  public Node getNext() {
    return this.next;
  }

  @Override
  public String toString() {
    return "Node(" //
        + "str=" + this.str //
        + ", node=" + this.next //
        + ")";
  }

  public static void main(String[] args) {
    
    //hello,abc,def
    Node head = new Node("hello", new Node("abc", new Node("def")));
    System.out.println(head);

    //check head contain "def" ->true /false;
    // for loop? while loop -> linkedlist
    Node target = head;
    boolean result = false;
    while(head != null) {
      if ("def".equals(target.getStr())) {
        result = true;
        break;
      }
      target = target.getNext();
    }
    System.out.println(result);
    System.out.println(target.getStr());

  
  }
}
