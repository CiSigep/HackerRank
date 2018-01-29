    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node InsertNth(Node head, int data, int position) {
    Node toInsert = new Node();
    toInsert.data = data;
    
    if(head==null)return toInsert;
    
    if(position == 0){
        toInsert.next = head;
        return toInsert;
    }
    
    Node current = head;
    int i = 0;
    while(i < position - 1 && current.next != null){
        current = current.next;
        i++;
    }
    
    toInsert.next = current.next;
    
    current.next = toInsert;
    
    return head;

}
