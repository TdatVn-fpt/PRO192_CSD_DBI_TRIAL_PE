package numbers_strings.extra;
//  Câu 2: Đếm từ "you" (Count word)

public class Count_word {

    public void solve(String s) {
        String[] words = s.trim().split("\\s+"); // cắt chuỗi thành mảng bao giờ cũng phải dùng cái này
        int count = 0;

        for (String w : words) {  // kiểu dữ liệu biến tạm : tên mảng nguồn      
            // so sánh không phân biệt chữ hoa chữ thường
            if (w.equalsIgnoreCase("you")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
