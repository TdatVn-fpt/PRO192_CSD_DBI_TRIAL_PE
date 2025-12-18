package q3demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> li = new ArrayList<Student>();

        // Nhập dữ liệu mẫu giống đề bài
        li.add(new Student("Hung", 19));
        li.add(new Student("Giang", 213));
        li.add(new Student("Anh", 8));
        li.add(new Student("Phung", 47));
        li.add(new Student("An", 561));
        li.add(new Student("Cau", 65));
        li.add(new Student("Bich", 34));
        li.add(new Student("Anh", 83));

        int numberElement;
        Scanner sc = new Scanner(System.in);
        System.out.print("Add how many elements:");
        numberElement = sc.nextInt();
        sc.nextLine();

        if (numberElement > 0) {
            String name;
            int code;
            for (int i = 0; i < numberElement; i++) {
                name = sc.nextLine();
                code = sc.nextInt();
                sc.nextLine();
                li.add(new Student(name, code));
            }
        }
        
        // hàm in ra
        System.out.println("The list before running f1:");
        for (Student s : li) {
            System.out.print("(" + s.getName() + "," + s.getCode() + ") ");
        }

        // Gọi hàm f2 để lấy kí tự
        System.out.println("");
        System.out.println("OUTPUT:");
        IStudent is = new MyStudent();
        System.out.println(is.f1(li));

        System.out.println("");
        System.out.println("The list before running f2:");
        for (Student s : li) {
            System.out.print("(" + s.getName() + "," + s.getCode() + ") ");
        }

        System.out.println("");
        System.out.println("OUTPUT:");
        is.f2(li);
        for (Student s : li) {
            System.out.print("(" + s.getName() + "," + s.getCode() + ") ");
        }
        
        // --- ĐOẠN CODE CẦN VIẾT THÊM CHO F3 ---
        System.out.println("");
        System.out.println("The list before running f3:");
        // In danh sách trước khi sắp xếp để dễ so sánh
        for (Student s : li) {
            System.out.print("(" + s.getName() + "," + s.getCode() + ") ");
        }

        System.out.println("");
        System.out.println("OUTPUT:");
        
        // Gọi hàm f3 để sắp xếp 5 phần tử cuối
        is.f3(li);
        
        // In danh sách sau khi đã sắp xếp
        for (Student s : li) {
            System.out.print("(" + s.getName() + "," + s.getCode() + ") ");
        }
        System.out.println(""); 
        // ----------------------------------------
    }
}



