    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if(position == 0 && head != null)
        return head.next;
    if(head == null)
        return null;
    int i = 0;
    Node toDel = head;
    Node prev = null;
    while(i < position && toDel.next!= null){
        prev = toDel;
        toDel = toDel.next;
        i++;
    }
    
    prev.next = toDel.next;
    
    return head;
    

}
