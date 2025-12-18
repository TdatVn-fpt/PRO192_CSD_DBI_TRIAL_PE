package numbers_strings.extra;

/**
 * Câu 1: Tìm kiếm từ khóa với bài này chúng ta nên chuyển về chuỗi thường hết
 * trước khi check tránh việc chữ hoa/ thường làm sai lệch
 */
public class Search_within_string {

    // chuyển hết về chuỗi thường 
    public void solve(String s) {
        String lower = s.toLowerCase();

        if (lower.contains("me") || lower.contains("why") || lower.contains("well")) {
            System.out.println("INCLUDE");
        } else {
            System.out.println("NOT");
        }
    }
}
