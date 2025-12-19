/* This program contains 2 parts: (1) and (2)
   YOUR TASK IS TO COMPLETE THE PART  (2)  ONLY
 */
//(1)==============================================================
import java.util.*;
import java.io.*;
class MyList
 {Node head,tail;
  MyList() {head=tail=null;}
  boolean isEmpty()
   {return(head==null);
   }
  void clear() {head=tail=null;}

  void fvisit(Node p, RandomAccessFile f) throws Exception
   {if(p != null) f.writeBytes(p.info + " ");
   }

  void ftraverse(RandomAccessFile f) throws Exception
   {Node p = head;
    while(p!=null)
      {fvisit(p,f); // You will use this statement to write information of the node p to the file
       p=p.next;
      }
    f.writeBytes("\r\n");
   }

  void loadData(int k)  //do not edit this function
   {String [] a = Lib.readLineToStrArray("data.txt", k);
    int [] b = Lib.readLineToIntArray("data.txt", k+1);
    int n = a.length;
    for(int i=0;i<n;i++) addLast(a[i],b[i]);
   }

//===========================================================================
//(2)===YOU CAN EDIT OR EVEN ADD NEW FUNCTIONS IN THE FOLLOWING PART========
//===========================================================================
  void addLast(String xOwner, int xPrice)
   {//You should write here appropriate statements to complete this function.
       if (xOwner.charAt(0)== 'A'||xPrice>100) {
           return;
       }
       addLast(new Car(xOwner, xPrice));
   }
 public void addLast(Car x){
        Node q = new Node(x);
        if(isEmpty()){head=tail=q;return;}
        tail.next=q;tail=q;
   }
 
  void f1() throws Exception
    {/* You do not need to edit this function. Your task is to complete the addLast  function
        above only.
     */
     clear();
     loadData(1);
     String fname = "f1.txt";
     File g123 = new File(fname);
     if(g123.exists()) g123.delete();
     RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
     ftraverse(f);
     f.close();
    }  

//==================================================================
  void f2() throws Exception
    {clear();
     loadData(4);
     String fname = "f2.txt";
     File g123 = new File(fname);
     if(g123.exists()) g123.delete();
     RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
     ftraverse(f);
     Car x = new Car("X",1);
     Car y = new Car("Y",2);
     //------------------------------------------------------------------------------------
     /*You must keep statements pre-given in this function.
       Your task is to insert statements here, just after this comment,
       to complete the question in the exam paper.*/


        addFirst(y);
    //------------------------------------------------------------------------------------
     ftraverse(f);
     f.close();
    }  

  public void insertBeforeIndexK(Car c,int k) {
    Node newNode = new Node(c);

    if (k == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }

    int count = 0;
    Node p = head;
    Node previous = null;

    while (p != null && count < k) {
        previous = p;
        p = p.next;
        count++;
    }

    if (count == k) {
        previous.next = newNode;
        newNode.next = p;
    } else {
        return;
    }
}
   public void addFirst(Car x){
		Node p = new Node(x);
		if(isEmpty()) {head = tail = p;}
		else {p.next = head; head = p;}
    }

  
//==================================================================
  void f3() throws Exception
   {clear();
    loadData(7);
    String fname = "f3.txt";
    File g123 = new File(fname);
    if(g123.exists()) g123.delete();
    RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
    ftraverse(f);
    //------------------------------------------------------------------------------------
     /*You must keep statements pre-given in this function.
       Your task is to insert statements here, just after this comment,
       to complete the question in the exam paper.*/

       dele(findSecondNode());

    //------------------------------------------------------------------------------------
    ftraverse(f);
    f.close();
   }
  public void dele(Node q){
		Node f,p; f=null;p=head;
		while(p!=null){
			if(p==q) break;
			f=p;p=p.next;
		}
		if(p==null) return;
		if(f==null){
			head=head.next;
			if(head==null) tail=null;
			return;
		}
		f.next=p.next;
		if(f.next==null) tail=f;
	 }

  public Node findSecondNode() {
    Node p = head;
    int count = 0;
    while (p != null) {
        if (p.info.price == 5) {
            count++;
            if (count == 2) {
                // Tìm thấy nút thứ hai có age =5
                return p;
            }
        }
        p = p.next;
    }
    return null;
}

  public Node search(int xAge){
		Node p=head;
		while(p!=null){
			if(p.info.price == xAge) return(p);
			p=p.next;
        }
		return(null);
     }


//==================================================================
  void f4() throws Exception
   {clear();
    loadData(10);
    String fname = "f4.txt";
    File g123 = new File(fname);
    if(g123.exists()) g123.delete();
    RandomAccessFile  f = new RandomAccessFile(fname, "rw"); 
    ftraverse(f);
    //------------------------------------------------------------------------------------
     /*You must keep statements pre-given in this function.
       Your task is to insert statements here, just after this comment,
       to complete the question in the exam paper.*/



    //------------------------------------------------------------------------------------
    ftraverse(f);
    f.close();
   }

 }
