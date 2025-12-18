
public class SpecCoffee extends Coffee {

    private int price;

    public SpecCoffee() {
    }

    public SpecCoffee(String name, int size, int price) {
        super(name, size);
        this.price = price;
    }

    @Override
    public String toString() {
        return getName() + ", " + getSize() + ", " + price;
    }

    public void setData() {
        String s = getName();
        String currentName = "CF" + s.substring(0, s.length());
        setName(currentName);
    }

    public int getValue() {
        if (getSize() > 10) {
            return price;
        } else {
            return price + 5;
        }
    }

}
