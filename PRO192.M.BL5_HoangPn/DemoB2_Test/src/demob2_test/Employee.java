package demob2_test;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private int seniority;

    public Employee() {
    }

    public Employee(int id, String name, double salary, int seniority) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.seniority = seniority;
    }

    public void setSeniority(int seniority) {
        if (seniority <= 0) {
            this.seniority = 1;
        } else {
            this.seniority = seniority;
        }
    }

    public void updateSalary() {
        if (seniority >= 3 && seniority < 5) {
            salary = salary * 1.30;
        } else if (seniority > 6 && seniority < 10) {
            salary = salary * 1.5;
        } else if (seniority > 10) {
            salary = salary * 2.0;
        }
    }

    @Override
    public String toString() {
        return String.format("Employee : %d, %s, %.2f, %d", id, name, salary, seniority);
    }

    // (Optional getters/setters if you need them)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


