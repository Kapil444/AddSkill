/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> auxQ = new Stack<>();
        Node temp = head;
        if(temp==null || temp.next==null&&temp.child==null){
            return head;
        }
        while(temp!=null){
            if(temp.child!=null){
                if(temp.next!=null)
                    auxQ.push(temp.next);
                // temp = temp.child;
                temp.next = temp.child;
                temp.next.prev = temp;
                temp.child = null;
            }else{
                 temp = temp.next;           
            }
           if(temp!=null && temp.next==null){
               if(!auxQ.empty()){
                   temp.next = auxQ.peek();
                   temp.next.prev = temp;
                   auxQ.pop();
               }
           }
        }
        return head;
    }
}
