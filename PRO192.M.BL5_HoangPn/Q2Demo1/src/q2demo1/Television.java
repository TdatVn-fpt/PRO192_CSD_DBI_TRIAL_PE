
package q2demo1;

public class Television {
    private String maker;
    private int size;

    public Television() {
    }

    public Television(String maker, int size) {
        this.maker = maker;
        this.size = size;
    }

    public String getMaker() {
        return maker;
    }

    public int getSize() {
        return size;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Television(" + maker + ", " + size + ")";
    }
}
