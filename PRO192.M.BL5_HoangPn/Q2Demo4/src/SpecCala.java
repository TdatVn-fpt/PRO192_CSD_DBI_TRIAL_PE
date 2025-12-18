
public class SpecCala extends Cala {

    private int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

   

    @Override
    public String toString() {
        return getOwner() + "," + getPrice() + "," + color;
    }

    public void setData() {
        String s = getOwner();
        if (s == null || s.length() < 2) {
            return;
        }

        String newS = s.substring(0, 1) + "XX" + s.substring(2);
        setOwner(newS);
    }

    public int getValue() {
        if (color % 2 == 0) {
            return getPrice() + 3;
        } else {
            return getPrice() + 7;
        }
    }

}
