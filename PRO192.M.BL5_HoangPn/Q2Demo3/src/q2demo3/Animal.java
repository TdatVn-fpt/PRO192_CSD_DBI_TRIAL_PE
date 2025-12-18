
package q2demo3;

public class Animal {
       private String name;
       private int price;

    public Animal() {
    }

    public Animal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    
      
       @Override
    public String toString() {
        return "Animal(" + name + "-" + price + ")";
    }
       
       
}
