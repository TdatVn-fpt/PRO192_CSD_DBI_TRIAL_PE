
package demob7;


public class Student<T> {
   private String enrollnumber;
   private String firstName;
   private String lastName;
   private double mark;

    public Student() {
    }

    public Student(String enrollnumber, String firstName, String lastName, double mark) {
        this.enrollnumber = enrollnumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public String getEnrollnumber() {
        return enrollnumber;
    }

    public void setEnrollnumber(String enrollnumber) {
        this.enrollnumber = enrollnumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "enrollnumber=" + enrollnumber + ", firstName=" + firstName + ", lastName=" + lastName + ", mark=" + mark + '}';
    }
   
    
   
    
}
