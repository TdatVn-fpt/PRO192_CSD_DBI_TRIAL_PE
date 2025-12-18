
 public class Cake {
 private String maker;
 private int price;

    public Cake() {
    }

    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {        
        String currentName = maker.substring(0,1).toUpperCase() + maker.substring(1, maker.length()).toLowerCase();
         return currentName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
 
 
}
