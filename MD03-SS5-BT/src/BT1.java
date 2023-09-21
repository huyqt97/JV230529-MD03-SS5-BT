import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        String st = new Scanner(System.in).nextLine();
        if (st.isEmpty()) {
            System.out.println("Đây là chuỗi rỗng.");
        } else {
            System.out.println("Chuỗi là: " + st);
        }
    }
}
