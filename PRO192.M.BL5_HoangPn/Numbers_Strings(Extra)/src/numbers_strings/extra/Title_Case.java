package numbers_strings.extra;
//3. Câu 3: Viết hoa chữ cái đầu mỗi từ (Title Case)

public class Title_Case {

    public void solve(String s) {

        if (s == null || s.trim().isEmpty()) {  // Nếu tên chưa có (null) hoặc rỗng thì dừng luôn, không làm gì cả            
        }

        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {  // kiểu dữ liệu biến tạm: /*t*/ên mảng nguồn
            if (word.length() > 0) {
                 // Đầu hoa
                String first = word.substring(0, 1).toUpperCase();
                 // Đuôi thường
                String rest = word.substring(1).toLowerCase();
                // Ghép lại + dấu cách
                sb.append(first).append(rest).append(" ");
            }
        }
// trong bài áp dụng sửa đối tượng cần gọi là được 
        System.out.println(sb.toString().trim());
    }

}
