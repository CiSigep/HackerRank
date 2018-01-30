// This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  if(head == null)
    ;
else{
    ReversePrint(head.next);
    System.out.println(head.data);
}
}
