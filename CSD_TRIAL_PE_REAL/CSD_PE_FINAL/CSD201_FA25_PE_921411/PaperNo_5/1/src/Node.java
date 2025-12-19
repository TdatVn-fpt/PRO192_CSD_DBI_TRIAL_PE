// =========== DO NOT EDIT THE GIVEN CONTENT OF THIS FILE ============
class Node {
  Canoe info;
  Node next;
  Node() {
   }
  Node(Canoe x, Node p) {
    info=x;next=p;
   }
  Node(Canoe x) {
    this(x,null);
   }
 }

