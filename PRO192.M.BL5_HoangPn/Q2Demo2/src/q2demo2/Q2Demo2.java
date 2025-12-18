
package q2demo2;

import java.util.Scanner;


public class Q2Demo2 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input đầu vào
        System.out.print("Enter owner:");
        String owner = sc.nextLine();

        System.out.print("Enter price:");
        int price = sc.nextInt();

        System.out.print("Enter color:");
        int color = sc.nextInt();
       
        //tạo đối tượng để truyền vào
        SpecBike t = new SpecBike(owner, price, color);// tạo đối tượng mới để truyền vào 
        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");
        System.out.print("Enter TC(1,2,3):");
        int choice = sc.nextInt();
        
        System.out.println("OUTPUT:");

        //hàm sử lý điều kiện
        if (choice == 1) {
            Bike viplam = new Bike(owner, price);
            System.out.println(viplam.toString());
            System.out.println(t.toString());
        } else if (choice == 2) {
            t.setData();
            System.out.println(t);
        } else if (choice == 3) {
            System.out.println(t.getValue());
        }

    }

    
}
