
package demob7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DemoB7 {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);


        List<Student> li = new ArrayList<Student>();
        Student element;
        for (int i = 0; i < 10; i++) {
            element = new Student(
                    "HE190867" + i,
                    "Nguyễn" + i,
                    "Tiến Đạt",
                    i);
            li.add(element);
        }

        for (Object e : li) {
            System.out.println(e);
        }
        System.out.println("");

        System.out.print("Nhap them phan tu moi: ");
        element = new Student("he190867", "Hoàng", "Nguyễn", 5);
        li.add(element);

        for (Student e : li) {
            System.out.print(e );
        }
        System.out.println("");

        System.out.print("Them vao phan tu moi o vi tri thu 3: ");
        element = new Student("he190333", "Hoang","Phan", 6);
        li.add(3, element); // Thêm vào index 3
        for (Student e : li) {
            System.out.print(e);
        }
        System.out.println("");
//
        System.out.print("Xoa phan tu cuoi cung: ");
        int removeIndex = li.size() - 1;
        li.remove(removeIndex);
        for (Student e : li) {
            System.out.print(e);
        }
        System.out.println("");

        System.out.print("Sinh viên có điểm lớn nhất của danh sách: ");
        //Giống như bạn đi dọc một hàng người để tìm người cao nhất. Bạn cầm cái thước đo người đầu tiên, sau đó so sánh với người tiếp theo. Ai cao hơn thì bạn "nhớ" chiều cao người đó.
        double max = Double.MIN_VALUE;
        Student maxStudent = null;
        for (Student e : li) {
            if (e.getMark() > max) {
                max = e.getMark();
                maxStudent = e;
            }
        }
        System.out.println(maxStudent);
//
//        System.out.print("Phần tử lẻ lớn nhất của danh sách: ");
//        int Oddmax = Integer.MIN_VALUE;
//        for (int e : li) {
//            if (e > Oddmax && e % 2 != 0) {
//                Oddmax = e;
//            }
//        }
//        System.out.println(Oddmax);
//
//        System.out.print("Tìm kiếm 1 phần tử: ");
//        element = sc.nextInt();
//        int found = -1; // nếu không tìm thấy luôn luôn trả giá trị về -1
//        int listSize = li.size();
//        for (int i = 0; i < listSize; i++) {
//            if (li.get(i) == element) {
//                found = i;
//                break;
//            }
//
//            if (found >= 0) {
//                System.out.println("Tìm thấy phần tử tại: " + found);
//            } else {
//                System.out.println("Không tìm thấy phần tử");
//            }
//
//            // cách 2 làm theo hàm có sẵn
//            found = li.indexOf(element);
//            System.out.println("Tìm thấy tại:" + found);
//
//        }
//
//        // Danh sách sắp xếp theo thứ tự tăng dần
//        System.out.println("Danh sách xắp xếp theo thứ tự tăng dần:");
//        listSize = li.size();
//        // selection sort
//        // Vòng lặp i: Là vị trí mình đang muốn "lấp đầy" số nhỏ nhất vào
//        for (int i = 0; i < listSize - 1; i++) {
//
//            // Giả sử phần tử ở vị trí i đang là nhỏ nhất
//            int min = li.get(i);
//            int minIndex = i;
//
//            // Vòng lặp j: Đi tìm xem phía sau (từ i+1) có ai nhỏ hơn thằng 'min' hiện tại không?
//            for (int j = i + 1; j < listSize; j++) {
//                // Nếu thấy thằng j nhỏ hơn thằng min đang giữ
//                if (min > li.get(j)) {
//                    min = li.get(j);  // Cập nhật giá trị min mới
//                    minIndex = j;     // Ghi nhớ địa chỉ nhà của thằng min mới này
//                }
//            }
//
//            // Sau khi chạy hết vòng j, ta đã tìm được thằng nhỏ nhất thực sự (nằm tại minIndex)
//            // Giờ thì HOÁN ĐỔI (Swap) thằng ở vị trí i và thằng minIndex
//            int tmp = li.get(i);                // Cất thằng ở vị trí i vào biến tạm
//            li.set(i, li.get(minIndex));        // Đưa thằng nhỏ nhất về vị trí i
//            li.set(minIndex, tmp);  // Đưa thằng cũ ở i về chỗ cũ của thằng nhỏ nhất
//            for (int e : li) {
//                System.out.print(e + " ");
//            }
//            System.out.print(" ");
//            
//        }

    }
    
}
