public class Corn {
    private String name;
    private int price;

  
    public Corn() {
    }

    
    public Corn(String name, int price) {
        this.name = name;
        this.price = price;
    }

    
    public String getName() {
        return price + name;
    }

   
    public int getPrice() {
        return price;
    }

   
    public void setPrice(int price) {
        int n = String.valueOf(this.price).length();
        this.price = price - n;
    }
}
