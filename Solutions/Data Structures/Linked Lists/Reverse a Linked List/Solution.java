// This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if(head == null || head.next== null)
        return head;
    else{
        Node node = Reverse(head.next);
        head.next.next = head;
        head.next = null;
        
        return node;
    }
        

}
