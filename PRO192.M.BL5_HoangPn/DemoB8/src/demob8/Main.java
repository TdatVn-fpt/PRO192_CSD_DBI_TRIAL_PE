package demob8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> lis = new ArrayList<>();
        String s = "hellofromfptupro";
        Student elements;

        for (int i = 0; i < 10; i++) {
            elements = new Student(
                    "HE21000" + i,
                    s.charAt(i) + "" + i,
                    s.charAt(i + 3) + "" + i,
                    i / 2
            );
            lis.add(elements);
        }

        System.out.println("Using Collections.sort");
        Collections.sort(lis);
        for (Student e : lis) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Using Collections.sort - by firstName");
        Collections.sort(lis, Student.compareToByFirstname);
        for (Student e : lis) {
            System.out.println(e);
        }
        System.out.println();

        System.out.println("Using Collections.sort - by mark descending");
        Collections.sort(lis, Student.compareToMarkDescending);
        for (Student e : lis) {
            System.out.println(e);
        }
        System.out.println("");

        System.out.println("Using Collections.sort - by mark then by firstName");
        Colections.sort(lis, Student.compareToByFirstname);
        for (Student e : lis) {
            System.out.println(e);
        }
        System.out.println();
    }
}


    

