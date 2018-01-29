Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
  if(head == null) // Empty List
  {
      head = new Node();
      head.data = data;
      return head;
  }
    
  Node current = head;
  while(current.next != null)
      current = current.next;
  
    current.next = new Node();
    current.next.data = data;
    return head;
}
