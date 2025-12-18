
package numbers_strings.extra;
//Yêu cầu: Tách các từ trong câu ra và sắp xếp nó theo thứ tự A-Z.
//Ví dụ: "don't like me" -> Sắp xếp thành: "don't", "like", "me", "You" (theo bảng chữ cái).

import java.util.Arrays;


public class Sort_words {
    /**
     * Tư duy code ở đây : 
     * cắt chuỗi vào mảng DÙNG S.SPLIT ("\\s+");
     *  dùng thư viện có sẵn để xắp xếp : array.sort(words); ( cần import java.util.Arrays;)
     * in ra mảng 
     * @param s
     */
    public void solve(String s){
        // điều kiện lúc nào cũng phải có khi cắt chuỗi 
       if (s == null || s.trim().isEmpty()) {
       return;
       } // thêm return tránh nullpointexception
       // 1. Cắt chuỗi ra mảng
        String[] words = s.trim().split("\\s+");
      // dùng array để xắp xếp tự động
      Arrays.sort(words);
      //output in ra
      
      for(String w : words) {
          System.out.print(w + " ");
      }
        System.out.println();      // xuống dòng cho đẹp thôi 
    }
}
