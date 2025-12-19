/* This program contains 2 parts: (1) and (2)
    YOUR TASK IS TO COMPLETE THE PART  (2)  ONLY
 */
//(1)==============================================================
import java.util.*;
import java.io.*;

public class MyList {
  Node head, tail;

  MyList() {
    head = tail = null;
  }

  boolean isEmpty() {
    return (head == null);
  }

  void clear() {
    head = tail = null;
  }

  void fvisit(Node p, RandomAccessFile f) throws Exception {
    if (p != null)
      f.writeBytes(p.info + " ");
  }

  void ftraverse(RandomAccessFile f) throws Exception {
    Node p = head;
    while (p != null) {
      fvisit(p, f); 
      p = p.next;
    }
    f.writeBytes("\r\n");
  }

  void loadData(int k) { // do not edit this function
    String[] a = Lib.readLineToStrArray("data.txt", k);
    int[] b = Lib.readLineToIntArray("data.txt", k + 1);
    int[] c = Lib.readLineToIntArray("data.txt", k + 2);
    int n = a.length;
    for (int i = 0; i < n; i++)
      addLast(a[i], b[i], c[i]);
  }

  // ===========================================================================
  // (2)===YOU CAN EDIT OR EVEN ADD NEW FUNCTIONS IN THE FOLLOWING PART========
  // ===========================================================================
  
  void addLast(String xDriver, int xRate, int xColor) {
    // You should write here appropriate statements to complete this function.
    // check if xDriver.charAt(0) == 'B' then do nothing
    if (xDriver.charAt(0) == 'B') {
      return;
    }

    // otherwise add new node to the end of the list
    Canoe newCanoe = new Canoe(xDriver, xRate, xColor);
    Node newNode = new Node(newCanoe);

    if (isEmpty()) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  // You do not need to edit this function. Your task is to complete the addLast
  // function above only.
  void f1() throws Exception {
    clear();
    loadData(1);
    String fname = "f1.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    ftraverse(f);
    f.close();
  }

  // ==================================================================
  // ===== HELPER FUNCTIONS FOR F2 =====
  void addFirst(Canoe c) {
    Node p = new Node(c);
    if (isEmpty()) {
      head = tail = p;
    } else {
      p.next = head;
      head = p;
    }
  }

  Node pos(int k) {
    Node p = head;
    int i = 0;
    while (p != null) {
      if (i == k)
        return p;
      i++;
      p = p.next;
    }
    return null; // Not found
  }

  void addAfter(Node p, Canoe c) {
    if (p == null)
      return;
    Node pNew = new Node(c, p.next);
    p.next = pNew;
    if (p == tail) {
      tail = pNew;
    }
  }

  Node beforeTail() {
    if (head == null || head == tail)
      return null; // 0 or 1 element
    Node p = head;
    while (p.next != tail) {
      p = p.next;
    }
    return p;
  }

  // ===================================
  void f2() throws Exception {
    clear();
    loadData(5);
    String fname = "f2.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    ftraverse(f);
    Canoe x, y, z;
    x = new Canoe("X", 1, 2);
    y = new Canoe("Y", 2, 3);
    z = new Canoe("Z", 3, 4);
    // ------------------------------------------------------------------------------------
    /*
     * You must keep statements pre-given in this function.
     * Your task is to insert statements here, just after this comment,
     * to complete the question in the exam paper.
     */
    // Insert x at position 0
    addFirst(x);

    // Insert y at position 3 (after position 2)
    Node p2 = pos(2);
    addAfter(p2, y);

    // Insert z before tail
    Node bt = beforeTail();
    addAfter(bt, z);
    // ------------------------------------------------------------------------------------
    ftraverse(f);
    f.close();
  }

  // ==================================================================
  // ===== HELPER FUNCTIONS FOR F3 =====
  int findMaxRate() {
    if (isEmpty())
      return -1;
    int max = head.info.rate;
    Node p = head.next;
    while (p != null) {
      if (p.info.rate > max) {
        max = p.info.rate;
      }
      p = p.next;
    }
    return max;
  }

  void remove(Node p) {
    if (p == null)
      return;
    if (p == head) { // Remove head
      head = head.next;
      if (head == null)
        tail = null; // List becomes empty
      return;
    }
    Node prev = head;
    while (prev != null && prev.next != p) {
      prev = prev.next;
    }
    if (prev != null) { // Found predecessor
      prev.next = p.next;
      if (p == tail) { // If removing tail
        tail = prev;
      }
    }
  }

  // ===================================
  void f3() throws Exception {
    clear();
    loadData(9);
    String fname = "f3.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    ftraverse(f);
    // ------------------------------------------------------------------------------------
    /*
     * You must keep statements pre-given in this function.
     * Your task is to insert statements here, just after this comment,
     * to complete the question in the exam paper.
     */
    // Remove the second node having rate < maximum rate.
    int maxRate = findMaxRate();
    int count = 0;
    Node p = head;
    while (p != null) {
      if (p.info.rate < maxRate) {
        count++;
        if (count == 2) {
          remove(p);
          break; // Stop after removing
        }
      }
      p = p.next;
    }
    // ------------------------------------------------------------------------------------
    ftraverse(f);
    f.close();
  }

  // ==================================================================
  void f4() throws Exception {
    clear();
    loadData(13);
    String fname = "f4.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    ftraverse(f);
    // ------------------------------------------------------------------------------------
    /*
     * You must keep statements pre-given in this function.
     * Your task is to insert statements here, just after this comment,
     * to complete the question in the exam paper.
     */
    // Find the first node p having driver = E. Reverse elements after p.
    Node p = head;
    while (p != null && !p.info.driver.equals("E")) {
      p = p.next;
    }

  
    if (p != null && p.next != null) {
      
      Node head2 = p.next;
      Node newTail = p.next;

      Node prev = null;
      Node curr = head2;
      Node nextNode = null;


      while (curr != null) {
        nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
      }


      p.next = prev; 
      tail = newTail; 
    }
    // ------------------------------------------------------------------------------------
    ftraverse(f);
    f.close();
  }

}