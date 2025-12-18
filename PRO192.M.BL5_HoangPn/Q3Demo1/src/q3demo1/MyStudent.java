package q3demo1;

import java.util.List;


public class MyStudent implements IStudent{

    @Override
    public int f1(List<Student> t) {
       int count = 0;
        for (Student s : t) {
            if (s.getName().startsWith("A") || s.getName().endsWith("g")) {
                count ++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Student> t) {
        int min = Integer.MAX_VALUE;
        int found = -1;
        int size = t.size();
        for (int i = 0; i < size; i++) {
            int code = t.get(i).getCode();
            if (code % 2 == 0 && code < min) {
                min = code;
                found = i;
            }
        }
        if (found >= 0) {
            t.remove(found);
        }
    }

    /**
     *
     * @param t
     */
    @Override
    public void f3(List<Student> t) {
        // SỬA LỖI: Tham số đầu vào là 't', không phải 'li'
        if (t.size() < 5) {
            return;
        }

        int n = t.size();
        // Vị trí bắt đầu của 5 phần tử cuối cùng
        int startPos = n - 5; 

        // BẮT ĐẦU THUẬT TOÁN SELECTION SORT (Theo form của bạn)
        // Chạy từ phần tử đầu tiên của nhóm 5 người cuối đến áp chót
        for (int i = startPos; i < n - 1; i++) {
            
            // Giả sử phần tử tại i đang có chữ số tận cùng nhỏ nhất
            int minIndex = i;
            // Lấy chữ số tận cùng: Code chia lấy dư cho 10
            int minLastDigit = t.get(i).getCode() % 10; 

            // Vòng lặp tìm thằng nhỏ nhất trong đám còn lại phía sau
            for (int j = i + 1; j < n; j++) {
                int currentLastDigit = t.get(j).getCode() % 10;

                // So sánh theo chữ số tận cùng (Tăng dần)
                if (currentLastDigit < minLastDigit) {
                    minLastDigit = currentLastDigit; // Cập nhật số bé nhất
                    minIndex = j;                    // Lưu vị trí của nó
                }
            }

            // HOÁN ĐỔI (SW/*A*/P)
            // Đưa thằng nhỏ nhất tìm được về vị trí i
            if (minIndex != i) {
                Student temp = t.get(i);
                t.set(i, t.get(minIndex));
                t.set(minIndex, temp);
            }
        }
    }

  
    
}
