package demob2_test;

import java.util.Scanner;

public class DemoB2_Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //input
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter seniority: ");
        int seniority = sc.nextInt();

        
        
        // tạo employee
        Employee e = new Employee(id, name, salary, seniority);

        // menu test
        System.out.println("1. Test setSeniority()");
        System.out.println("2. Test updateSalary()");
        System.out.print("Enter TC(1 or 2): ");
        int choice = sc.nextInt();

        
        
        if (choice == 1) {
            System.out.print("Enter new seniority: ");
            int newSeniority = sc.nextInt();
            e.setSeniority(newSeniority);
        } else if (choice == 2) {
            e.updateSalary();
        }

        System.out.println("OUTPUT:");
        System.out.println(e);
    }
}
