
package bai1;

import java.util.Scanner;

public class Bai1 {

    
    public static void main(String[] args) {
       int a;
       int b;
      
       Scanner sc = new Scanner(System.in);

       a = sc.nextInt();
       b = sc.nextInt();
       
       
        if (a == 0) {
            System.out.println("Vo nghiem");
        }else {
            double x = -b / a; 
            System.out.println("Nghiem x = " + x);
        }
    }
    
}
