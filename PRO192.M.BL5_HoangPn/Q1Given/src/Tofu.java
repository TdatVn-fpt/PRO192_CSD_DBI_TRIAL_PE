
public class Tofu {
    private String maker;
    private int quantity;

    public Tofu() {
            this.maker = ""; // khởi tạo chuỗi rỗng để tránh nullpointexception
       this.quantity = 0;
    }

    public Tofu(String maker, int quantity) {
        this.maker = maker;
        this.quantity = quantity;
    }

   public String getMaker() {
    // 1. Lớp bảo vệ: Nếu maker chưa có gì (null) hoặc rỗng
    // thì trả về chuỗi rỗng luôn, KHÔNG ĐƯỢC chạy lệnh charAt ở dưới
    if (this.maker == null || this.maker.length() < 2) { 
        return ""; // Trả về rỗng an toàn
    }
    
    
    
    char first = Character.toLowerCase(this.maker.charAt(0));
    char last = Character.toLowerCase(this.maker.charAt(this.maker.length() - 1));
    String middle = this.maker.substring(1, this.maker.length() - 1);
    // Dấu cộng (+) trong chuỗi là phép nối.
    return first + middle + last;
}

    public int getQuantity() {
        return quantity;
    }

    
    
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
                
    }
    
    
}
