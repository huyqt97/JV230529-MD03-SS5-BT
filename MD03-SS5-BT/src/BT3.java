import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String st = sc.nextLine();
        StringBuilder sb = new StringBuilder("Chuỗi này là: ");

        // Thêm vào chuỗi
        sb.append(st);
        System.out.println(sb);

        // Chèn vào chuỗi
        sb.insert(5, " kakak");
        System.out.println(sb);

        // Xóa chuỗi
        sb.delete(5, 7);
        System.out.println(sb);
    }
}
