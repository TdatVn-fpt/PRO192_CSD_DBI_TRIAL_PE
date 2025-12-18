package numbers_strings.extra;

import java.util.Scanner;

public class Numbers_StringsExtra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { // là một biên hoặc 1 biểu thức so sánh với các giá trị trong từng case
            //menu switch to testing
            System.out.println("==========MENU===========");
            System.out.println("0.Stop program");
            System.out.println("1.Search_within_string(Tìm kiếm 1 trong các từ khóa why, me, well xem tồn tại không) ");
            System.out.println("2.Count word (Đếm từ \"you\")");
            System.out.println("3.Title Case(Viết hoa chữ cái đầu mỗi từ)");
            System.out.println("4.Weird Case( Đầu thường - Đuôi hoa )");
            System.out.println("5.Sắp xếp từ tăng dần (Sort words)_ Tách các từ trong câu ra và sắp xếp nó theo thứ tự A-Z.");
            System.out.println("6.Xóa ký tự đầu tiên tìm thấy : ");
            System.out.print("Chọn tính năng từ 1-6 để test các hàm string:");
            int choice = sc.nextInt();
            sc.nextLine(); // chen vao do bai nay toan chuoi nuot enter

            if (choice == 0) {
                break;  // luôn luôn phải dùng break tránh tình trạng fall through
            }
            // Nhập đầu vào cho bài toán
            System.out.print("Enter the String: ");
            String input = sc.nextLine();

            System.out.println("OUTPUT: ");

            switch (choice) {
                case 1:
                    Search_within_string q1 = new Search_within_string();
                    q1.solve(input);
                    break;
                case 2:
                    Count_word q2 = new Count_word();
                    q2.solve(input);
                    break;
                    case 3:
                    Title_Case q3 = new Title_Case();
                    q3.solve(input);
                    break;
                    case 4: // cái 4 là ngược lại của cái 3 cái 3 là từ đầu viết mua cái sau viết thường thì cái 4 ngược lại 
                        //4 đầu viết thường sau viết hoa
                    Weird_Case q4 = new Weird_Case();
                    q4.solve(input);
                    break;
                    case 5:
                    Sort_words q5 = new Sort_words();
                    q5.solve(input);
                    break;
                    case 6:
                    Delete_first q6 = new Delete_first();
                    q6.Solve(input);
                    break;
                default:
                    System.out.println("Xin vui lòng nhập lại: ");
            }

        }

    }

}
