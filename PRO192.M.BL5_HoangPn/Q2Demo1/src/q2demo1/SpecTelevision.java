package q2demo1;

public class SpecTelevision extends Television {
    private int price;

    public SpecTelevision() {
        super();
    }

    public SpecTelevision(String maker, int size, int price) {
        super(maker, size);
        this.price = price;
    }

   
    public void setData() {
        String m = getMaker();
        if (m != null && m.length() >= 3) { // tránh trường hợp NullPointerException
            // vì cắt từ index 3 trở đi nên phải có 3 kí tự 
            // (0,1) chỉ láy kí tự đầu tiên
            // nếu chỉ có substring không sẽ chỉ lấy kí tự đầu đến kí tự cuối thay vì ( từ 0 đến 1 ) 
            String newM = m.substring(0,1) + "XXX" + m.substring(3);
            setMaker(newM);
        }
    }

    
    public int getValue() {
        if (getSize() < 10) {return price + 5;} 
        return price + 10;
    }

    @Override
    public String toString() { // gọi trực tiếp từ lớp cha thay vì sử dụng gọi lại 
        return "SpecTelevision(" + getMaker() + ", " + getSize() + ", " + price + ")";
    }
}
