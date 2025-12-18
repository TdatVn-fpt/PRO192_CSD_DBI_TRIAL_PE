package q2demo3;

import java.util.Scanner;

public class Q2Demo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        int price = sc.nextInt();
        
        //thêm vào dòng này dọn phím enter thừa sô muốn nhập chữ tiếp theo phải tạo ra để nhuốt enter
        sc.nextLine();

        System.out.print("Enter sound: ");
        String sound = sc.nextLine();

        //Khai báo đối tượng con 
        SpecAnimal vipp = new SpecAnimal(name, price, sound);

        //menu hàm processs
        System.out.println("1.Test toString()");
        System.out.println("1.Test setData()");
        System.out.println("1.Test getValue()");
        System.out.print("Enter TC(1,2,3):");
        int choice = sc.nextInt();
        
        System.out.println("OUTPUT:");

        // hàm xử lý điều kiện
        if (choice == 1) {
            Animal vip = new Animal(name, price);
            System.out.println(vip.toString()); // muốn dùng phải tạo đối tượng truyền vào đây là lớp cha
            System.out.println(vipp.toString()); // thằng con          
        } else if(choice == 2)  {
            vipp.setData();
            System.out.println(vipp);
        }  else if(choice == 3) {
            System.out.println(vipp.getValue());
        }
        }
    }


