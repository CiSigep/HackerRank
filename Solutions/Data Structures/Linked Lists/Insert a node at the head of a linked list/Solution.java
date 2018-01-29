// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
    Node newHead = new Node();
    newHead.data = x;
    newHead.next = head;
    
    return newHead;
    
}
