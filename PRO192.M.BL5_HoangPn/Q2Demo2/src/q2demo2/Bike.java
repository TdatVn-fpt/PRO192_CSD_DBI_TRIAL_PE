
package q2demo2;

public class Bike {
    private String owner;
    private int price;

    public Bike() {
    }

    public Bike(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Bike(" + owner + "@" + price + ")";
    }
    
    
}
