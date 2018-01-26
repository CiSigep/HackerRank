    
void Print(Node head) {
    Node cur = head;
    while(null != cur)
    {
        System.out.println(cur.data);
        cur = cur.next;
    }
  
}
