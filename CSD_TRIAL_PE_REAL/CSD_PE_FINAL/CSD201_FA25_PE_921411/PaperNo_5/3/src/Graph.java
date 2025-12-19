/* This program contains 2 parts: (1) and (2)
    YOUR TASK IS TO COMPLETE THE PART  (2)  ONLY
 */
//(1)============================================
import java.io.*;
import java.util.*;
//-------------------------------------------------------------------------------

public class Graph {
  int[][] a;
  int n;
  char v[];
  int deg[];

  Graph() {
    v = "ABCDEFGHIJKLMNOP".toCharArray();
    deg = new int[20];
    a = new int[20][20];
    n = 0;
  }

  void loadData(int k) { // do not edit this function
    RandomAccessFile f;
    int i, j, x;
    String s;
    StringTokenizer t;
    a = new int[20][20];
    try {
      f = new RandomAccessFile("data.txt", "r");
      for (i = 0; i < k; i++)
        f.readLine();
      s = f.readLine();
      s = s.trim();
      n = Integer.parseInt(s);
      for (i = 0; i < n; i++) {
        s = f.readLine();
        s = s.trim();
        t = new StringTokenizer(s);
        for (j = 0; j < n; j++) {
          x = Integer.parseInt(t.nextToken().trim());
          a[i][j] = x;
        }
      }
      f.close();
    } catch (Exception e) {
    }

  }

  void dispAdj() {
    int i, j;
    for (i = 0; i < n; i++) {
      System.out.println();
      for (j = 0; j < n; j++)
        System.out.printf("%4d", a[i][j]);
    }
  }

  void fvisit(int i, RandomAccessFile f) throws Exception {
    f.writeBytes("  " + v[i]);
  }

  /*
   * There is an array int deg[] already declared in the class Graph
   * You should write a funcion to calculate d[i] = degree of the vertex i
   */
  void fvisitDeg(int i, RandomAccessFile f) throws Exception {
    f.writeBytes("  " + v[i] + "(" + deg[i] + ")"); 
  }

  void fdispAdj(RandomAccessFile f) throws Exception {
    int i, j;
    f.writeBytes("n = " + n + "\r\n");
    for (i = 0; i < n; i++) {
      f.writeBytes("\r\n");
      for (j = 0; j < n; j++)
        f.writeBytes("  " + a[i][j]);
    }
    f.writeBytes("\r\n");
  }

  void breadth(boolean[] en, int i, RandomAccessFile f) throws Exception {
    Queue q = new Queue();
    int r, j;
    q.enqueue(i);
    en[i] = true;
    while (!q.isEmpty()) {
      r = q.dequeue();
      fvisit(r, f);
      for (j = 0; j < n; j++) {
        if (!en[j] && a[r][j] > 0) {
          q.enqueue(j);
          en[j] = true;
        }
      }
    }
  }

  void breadth(int k, RandomAccessFile f) throws Exception {
    boolean[] en = new boolean[20];
    int i;
    for (i = 0; i < n; i++)
      en[i] = false;
    breadth(en, k, f);
    for (i = 0; i < n; i++)
      if (!en[i])
        breadth(en, i, f);
  }

  void depth(boolean[] visited, int k, RandomAccessFile f) throws Exception {
    fvisit(k, f);
    visited[k] = true;
    for (int i = 0; i < n; i++) {
      if (!visited[i] && a[k][i] > 0)
        depth(visited, i, f);
    }
  }

  void depth(int k, RandomAccessFile f) throws Exception {
    boolean[] visited = new boolean[20];
    int i;
    for (i = 0; i < n; i++)
      visited[i] = false;
    depth(visited, k, f);
    for (i = 0; i < n; i++)
      if (!visited[i])
        depth(visited, i, f);
  }

  // ===========================================================================
  // (2)===YOU CAN EDIT OR EVEN ADD NEW FUNCTIONS IN THE FOLLOWING PART========
  // ===========================================================================

  // ===== HELPER FUNCTIONS FOR F1 =====
  // Calculate degree for all vertices
  void calculateDegrees() {
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
       
        if (a[i][j] > 0 && a[i][j] != 99) { // 99 is infinity
          count++;
        }
      }
      deg[i] = count;
    }
  }

 
  void breadth_collect(boolean[] en, int i, ArrayList<Integer> order) {
    Queue q = new Queue();
    int r, j;
    q.enqueue(i);
    en[i] = true;
    while (!q.isEmpty()) {
      r = q.dequeue();
      order.add(r); // Add to list instead of visiting
      for (j = 0; j < n; j++) {
        if (!en[j] && a[r][j] > 0) {
          q.enqueue(j);
          en[j] = true;
        }
      }
    }
  }

  // ===================================
  void f1() throws Exception {
    loadData(1);
    String fname = "f1.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    breadth(1, f);
    f.writeBytes("\r\n");
    // -------------------------------------------------------------------------------------
    /*
     * You must keep statements pre-given in this function.
     * Your task is to insert statements here, just after this comment,
     * to complete the question in the exam paper.
     */

  
    calculateDegrees();

   
    ArrayList<Integer> order = new ArrayList<>();
    boolean[] en = new boolean[20];
    for (int i = 0; i < n; i++)
      en[i] = false;
    breadth_collect(en, 1, order);
    for (int i = 0; i < n; i++) 
      if (!en[i])
        breadth_collect(en, i, order);

    
    fvisitDeg(order.get(1), f);
    fvisitDeg(order.get(2), f);
    fvisitDeg(order.get(3), f);

   
    fvisit(order.get(4), f);
    fvisit(order.get(5), f);
    fvisit(order.get(6), f);

    // -------------------------------------------------------------------------------------
    f.writeBytes("\r\n");
    f.close();
  }

  // =================================================================================================
  // ===== HELPER FUNCTIONS FOR F2 (DIJKSTRA) =====
  static final int INF = 99; // As per problem description


  void printPath(int[] prev, int start, int end, RandomAccessFile f) throws Exception {
    ArrayList<Integer> path = new ArrayList<>();
    int curr = end;
    while (curr != -1) {
      path.add(curr);
      curr = prev[curr];
    }
    Collections.reverse(path); 
   
    if (path.isEmpty() || path.get(0) != start) {
      f.writeBytes("  No path found");
      return;
    }

    for (int v : path) {
      fvisit(v, f);
    }
  }

  // ==============================================
  void f2() throws Exception {
    loadData(12);
    String fname = "f2.txt";
    File g123 = new File(fname);
    if (g123.exists())
      g123.delete();
    RandomAccessFile f = new RandomAccessFile(fname, "rw");
    // -------------------------------------------------------------------------------------
    /*
     * You must keep statements pre-given in this function.
     * Your task is to insert statements here, just after this comment,
     * to complete the question in the exam paper.
     */

    
    int start1 = 0;
    int end1 = 6;
    int[] dist1 = new int[n];
    int[] prev1 = new int[n];
    boolean[] visited1 = new boolean[n];
    ArrayList<Integer> selectedOrder1 = new ArrayList<>();

   
    for (int i = 0; i < n; i++) {
      dist1[i] = INF;
      prev1[i] = -1;
      visited1[i] = false;
    }
    dist1[start1] = 0;

   
    for (int count = 0; count < n; count++) {
    
      int u = -1;
      int minDist = INF + 1;
      for (int v = 0; v < n; v++) {
        if (!visited1[v] && dist1[v] < minDist) {
          minDist = dist1[v];
          u = v;
        }
      }

      if (u == -1)
        break; 

      visited1[u] = true;
      selectedOrder1.add(u); 

     
      for (int v = 0; v < n; v++) {
        if (!visited1[v] && a[u][v] > 0 && a[u][v] != INF) {
          int newDist = dist1[u] + a[u][v];
          if (newDist < dist1[v]) {
            dist1[v] = newDist;
            prev1[v] = u;
          }
        }
      }
    }

  
    for (int i = 0; i < 7; i++) {
      int v = selectedOrder1.get(i);
      if (i < 4) {
        f.writeBytes("  " + this.v[v] + "(" + dist1[v] + ")");
      } else {
        fvisit(v, f);
      }
    }
    f.writeBytes("\r\n");

   
    printPath(prev1, start1, end1, f);
    f.writeBytes("\r\n");

 
    int start2 = 2;
    int end2 = 6;
    int[] dist2 = new int[n];
    int[] prev2 = new int[n];
    boolean[] visited2 = new boolean[n];

  
    for (int i = 0; i < n; i++) {
      dist2[i] = INF;
      prev2[i] = -1;
      visited2[i] = false;
    }
    dist2[start2] = 0;

  
    for (int count = 0; count < n; count++) {
      int u = -1;
      int minDist = INF + 1;
      for (int v = 0; v < n; v++) {
        if (!visited2[v] && dist2[v] < minDist) {
          minDist = dist2[v];
          u = v;
        }
      }
      if (u == -1)
        break;
      visited2[u] = true;
      for (int v = 0; v < n; v++) {
        if (!visited2[v] && a[u][v] > 0 && a[u][v] != INF) {
          int newDist = dist2[u] + a[u][v];
          if (newDist < dist2[v]) {
            dist2[v] = newDist;
            prev2[v] = u;
          }
        }
      }
    }

   
    printPath(prev2, start2, end2, f);

    // -------------------------------------------------------------------------------------
    f.writeBytes("\r\n");
    f.close();
  }

}