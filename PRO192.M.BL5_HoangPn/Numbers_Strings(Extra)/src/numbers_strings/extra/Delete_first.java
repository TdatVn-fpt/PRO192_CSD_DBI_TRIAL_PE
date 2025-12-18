
package numbers_strings.extra;


public class Delete_first {
    public String Solve(String s){
        int index = s.charAt(0);
        // Quy tắc vàng: Trong Java, -1 nghĩa là "Tìm mỏi mắt không thấy đâu cả" (Not Found).
        if (index != -1) {  // Cắt phần trước nó + ghép với phần sau nó 9 theo tôi nghĩ là vế sau nên nó ghi thế
          //Phần đầu là từ 0 đến index
            String part1 = s.substring(0, index);
            // phần sau : từ index + 1 đến hết( bỏ qua index đấy)
            String part2 = s.substring(index +1);
            
            return part1 + part2;
        }
        return s;
    }
}
