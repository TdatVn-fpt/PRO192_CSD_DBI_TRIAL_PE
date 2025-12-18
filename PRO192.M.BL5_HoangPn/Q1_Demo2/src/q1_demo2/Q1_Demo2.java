
package q1_demo2;

import java.util.Scanner;


public class Q1_Demo2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tạo sẵn tài khoản giống ví dụ (balance = 100)
        SavingAccount s = new SavingAccount("A01", 100);

        // menu test
        System.out.println("1. Test savingWithDraw");
        System.out.println("2. Test savingDeposit()");
        System.out.print("Enter TC(1 or 2): ");
        int choice = sc.nextInt();

       
       System.out.print("Enter the money: ");
        int money = sc.nextInt();

        System.out.println();
        System.out.println("OUTPUT:");
        
        
        
        // cú pháp boolean
        if (choice == 1) {
            boolean ok = s.savingWithdraw(money);
            System.out.println("SavingWithdraw: " + ok);
            System.out.println("Balance: " + s.getMoney());
        } else if (choice == 2) {
            int newBalance = s.savingDeposit(money);
            boolean ok = (money > 0);   
            System.out.println("SavingDeposit: " + ok);
            System.out.println("Balance: " + newBalance);
        }
    }
}



      

      

        

