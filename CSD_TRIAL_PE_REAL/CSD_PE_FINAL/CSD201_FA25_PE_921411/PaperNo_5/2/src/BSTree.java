/* This program contains 2 parts: (1) and (2)
    YOUR TASK IS TO COMPLETE THE PART  (2)  ONLY
 */
//(1)==============================================================
import java.io.*;
import java.util.*;

public class BSTree {
  Node root;

  BSTree() {
    root = null;
  }

  boolean isEmpty() {
    return (root == null);
  }

  void clear() {
    root = null;
  }

  void visit(Node p) {
    System.out.print("p.info: ");
    if (p != null)
      System.out.println(p.info + " ");
  }

  void fvisit(Node p, RandomAccessFile f) throws Exception {
    if (p != null)
      f.writeBytes(p.info + " ");
  }

  void breadth(Node p, RandomAccessFile f) throws Exception {
    if (p == null)
      return;
    Queue q = new Queue();
    q.enqueue(p);
    Node r;
    while (!q.isEmpty()) {
      r = q.dequeue();
      fvisit(r, f);
      if (r.left != null)
        q.enqueue(r.left);
      if (r.right != null)
        q.enqueue(r.right);
    }
  }

  void preOrder(Node p, RandomAccessFile f) throws Exception {
    if (p == null)
      return;
    fvisit(p, f);
    preOrder(p.left, f);
    preOrder(p.right, f);
  }

  void inOrder(Node p, RandomAccessFile f) throws Exception {
    if (p == null)
      return;
    inOrder(p.left, f);
    fvisit(p, f);
    inOrder(p.right, f);
  }

  void postOrder(Node p, RandomAccessFile f) throws Exception {
    if (p == null)
      return;
    postOrder(p.left, f);
    postOrder(p.right, f);
    fvisit(p, f);
  }

  void loadData(int k) { // do not edit this function
    String[] a = Lib.readLineToStrArray("data.txt", k);
    int[] b = Lib.readLineToIntArray("data.txt", k + 1);
    int[] c = Lib.readLineToIntArray("data.txt", k + 2);
    int n = a.length;
    for (int i = 0; i < n; i++)
      insert(a[i], b[i], c[i]);
  }

  // ===========================================================================
  // (2)===YOU CAN EDIT OR EVEN ADD NEW FUNCTIONS IN THE FOLLOWING PART========
  // ===========================================================================
  void insert(String xDriver, int xRate, int xColor) {
    // You should insert here statements to complete this function
    if (xDriver.charAt(0) == 'B') {
      return;
    }

    Canoe newCanoe = new Canoe(xDriver, xRate, xColor);
    Node newNode = new Node(newCanoe);

    // Case 1: Empty tree
    if (isEmpty()) {
      root = newNode;
      return;
    }

    // Case 2: Non-empty tree
    Node p = root;
    Node f = null; // parent of p

    while (p != null) {
      if (p.info.color == xColor) {
        return;
      }

      f = p; 
      if (xColor < p.info.color) {
        p = p.left;
      } else {
        p = p.right;
      }
    }

    
    if (xColor < f.info.color) {
      f.left = newNode;
    } else {
      f.right = newNode;
    }
  }

  // Do not edit this function. Your task is to complete insert function above
  // only.
  void f1() throws Exception {
    clear();
    loadData(1);
    String fname = "f1.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    breadth(root, f);
    f.writeBytes("\r\n");
    inOrder(root, f);
    f.writeBytes("\r\n");
    f.close();
  }

  // =============================================================
  // ===== HELPER FUNCTION FOR F2 =====
  // Perform breadth-first traversal but only visit non-leaf nodes
  void breadth2(Node p, RandomAccessFile f) throws Exception {
    if (p == null)
      return;
    Queue q = new Queue();
    q.enqueue(p);
    Node r;
    while (!q.isEmpty()) {
      r = q.dequeue();
      // Only visit if r is a non-leaf node
      if (r.left != null || r.right != null) {
        fvisit(r, f);
      }
      if (r.left != null)
        q.enqueue(r.left);
      if (r.right != null)
        q.enqueue(r.right);
    }
  }

  // ==================================
  void f2() throws Exception {
    clear();
    loadData(5);
    String fname = "f2.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    breadth(root, f);
    f.writeBytes("\r\n");
    // ------------------------------------------------------------------------------------
    /*
     * You must keep statements pre-given in this function.
     * Your task is to insert statements here, just after this comment,
     * to complete the question in the exam paper.
     */

    breadth2(root, f); 

    // ------------------------------------------------------------------------------------
    f.writeBytes("\r\n");
    f.close();
  }

  // =============================================================
  // ===== HELPER FUNCTIONS FOR F3 =====
  // Find parent of a node p
  Node findParent(Node p) {
    if (p == root)
      return null;
    Node f = null, c = root; // f = parent, c = current
    while (c != null && c != p) {
      f = c;
      if (c.info.color > p.info.color)
        c = c.left;
      else
        c = c.right;
    }
    return f;
  }


  void deleteByCopying(Node p) {
    if (p == null)
      return;
    if (p.left == null)
      return; 

    Node f_r = p; 
    Node r = p.left; 
    while (r.right != null) {
      f_r = r;
      r = r.right;
    }


    p.info = r.info;

  
    if (f_r == p) { 
      p.left = r.left;
    } else { 
      f_r.right = r.left;
    }
  }

  // ==================================
  void f3() throws Exception {
    clear();
    loadData(9);
    String fname = "f3.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    breadth(root, f);
    f.writeBytes("\r\n");
    // ------------------------------------------------------------------------------------
    /*
     * You must keep statements pre-given in this function.
     * Your task is to insert statements here, just after this comment,
     * to complete the question in the exam paper.
     * if the Node q!=null, you can use the statement:
     * f.writeBytes(p.info + "\r\n ");
     * to write p.info to the file f3.txt
     */

  
    Node p = null;
    Queue q = new Queue();
    q.enqueue(root);
    int count = 0;

    while (!q.isEmpty()) {
      Node r = q.dequeue();

      if (r.left != null) {
        count++;
        if (count == 4) {
          p = r;
          break;
        }
      }

      if (r.left != null)
        q.enqueue(r.left);
      if (r.right != null)
        q.enqueue(r.right);
    }

   
    if (p != null) {
      Node fa = findParent(p);
      if (fa != null) {
        f.writeBytes(fa.info + "\r\n "); // Write parent info
      }

     
      deleteByCopying(p);
    }
    // ------------------------------------------------------------------------------------
    breadth(root, f);
    f.writeBytes("\r\n");
    f.close();
  }

  // =============================================================
  // ===== HELPER FUNCTION FOR F4 =====
  void rotateLeft(Node p) {
    if (p == null || p.right == null)
      return; // Cannot rotate

    Node fa = findParent(p);
    Node c = p.right; 

    p.right = c.left; 
    c.left = p; 

   
    if (fa == null) {
      root = c;
    } else if (fa.left == p) {
      fa.left = c;
    } else {
      fa.right = c;
    }
  }

  // ==================================
  void f4() throws Exception {
    clear();
    loadData(13);
    ;
    String fname = "f4.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    breadth(root, f);
    f.writeBytes("\r\n");
    // ------------------------------------------------------------------------------------
    /*
     * You must keep statements pre-given in this function.
     * Your task is to insert statements here, just after this comment,
     * to complete the question in the exam paper.
     */

  
    Node p = null;
    Queue q = new Queue();
    q.enqueue(root);
    int count = 0;

    while (!q.isEmpty()) {
      Node r = q.dequeue();

      if (r.right != null) {
        count++;
        if (count == 2) {
          p = r;
          break;
        }
      }

      if (r.left != null)
        q.enqueue(r.left);
      if (r.right != null)
        q.enqueue(r.right);
    }


    if (p != null) {
      rotateLeft(p);
    }
    // ------------------------------------------------------------------------------------
    breadth(root, f);
    f.writeBytes("\r\n");
    f.close();
  }

}