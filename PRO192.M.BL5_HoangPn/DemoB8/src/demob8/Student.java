package demob8;

import java.util.Comparator;

public class Student implements Comparable<Student>{

    private String enrollnumber;
    private String firstName;
    private String lastName;
    private double mark;

    public Student(String enrollnumber, String firstName, String lastName, double mark) {
        this.enrollnumber = enrollnumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        int res = 0;
        if (this.mark > o.mark) {
            res = 1;
        } else if (this.mark < o.mark) {
            res = -1;
        } else {
            res = 0;
        }
        return 0;
    }
    
       public static Comparator<Student> compareToByFirstname 
               = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.firstName.compareTo(o2.firstName);
        }
    };

}
