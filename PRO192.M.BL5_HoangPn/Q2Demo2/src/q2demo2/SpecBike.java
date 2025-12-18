package q2demo2;

public class SpecBike extends Bike {

    private int color;

    public SpecBike() {
        super();
    }

    public SpecBike(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "SpecBike(" + getOwner() + " @ " + getPrice() + " # " + color + ")";
    }

    public void setData() {
        String s = getOwner();

        if (s == null || s.trim().isEmpty()) {  // Nếu tên chưa có (null) hoặc rỗng thì dừng luôn, không làm gì cả
           
        }
            /**
             * BƯỚC 2: Làm điều kiện (Process logic) Tư duy: Muốn xử lý từng từ,
             * ta phải cắt chuỗi ra thành mảng các từ s.trim(): Xóa dấu cách
             * thừa đầu đuôi split("\\s+"): Cắt chuỗi dựa vào khoảng trắng (chấp
             * nhận nhiều dấu cách liền nhau)
             * \s đại diện cho khoảng trắng, + một hoắc nhiều cái liền nhau , coi 100 vách gần nhau chỉ là 1 vách ngăn
             */
            String[] words = s.trim().split("\\s+");

            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < words.length; i++) {
//                String word = words[i]; // Phải dùng biến i để lôi đầu phần tử ra
//                // Xử lý...
//            }
            for (String word : words) {  // kiểu dữ liệu biến tạm: tên mảng nguồn
                if (word.length() > 0) {
                    // lấy kí tự đầu (0) viết hoa
                    String first = word.substring(0, 1).toUpperCase();
                    // lấy phần còn lại từ 1 đến hết viết thường 
                    String rest = word.substring(1).toLowerCase();
                    // ghép lại và thêm dấu cách đằng sau
                    sb.append(first).append(rest).append(" "); // hàm này để tách chuỗi ra cộng với dấu cách ở cuối " ".
                }
            }
            // Xét đối tượng mới (Set new object)
            // sb.toString().trim(): Chuyển về chuỗi và xóa nốt cái dấu cách thừa ở cuối cùng
            setOwner(sb.toString().trim());
        }
    

    public int getValue() {
        if (color % 2 == 0) {
            return getPrice() * 2;
        }
        return getPrice() * 5;

    }

}

