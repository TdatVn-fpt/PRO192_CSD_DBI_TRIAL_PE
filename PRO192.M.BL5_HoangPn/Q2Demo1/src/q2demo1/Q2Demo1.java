package q2demo1;

import java.util.Scanner;

public class Q2Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input đầu vào
        System.out.print("Enter maker:");
        String maker = sc.nextLine();

        System.out.print("Enter size:");
        int size = sc.nextInt();

        System.out.print("Enter price:");
        int price = sc.nextInt();
        //tạo đối tượng để truyền vào
        SpecTelevision t = new SpecTelevision(maker, size, price); // tạo đối tượng mới để truyền vào 
        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");
        System.out.print("Enter TC(1,2,3):");
        int choice = sc.nextInt();
        
        System.out.println("OUTPUT:");

        //hàm sử lý điều kiện
        if (choice == 1) {
            System.out.println(t.toString());
        } else if (choice == 2) {
            t.setData();
            System.out.println(t);
        } else if (choice == 3) {
            System.out.println(t.getValue());
        }

    }

}
