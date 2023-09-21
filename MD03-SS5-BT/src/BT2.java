import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ hai: ");
        String str2 = sc.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Hai chuỗi này giống nhau.");
        } else {
            System.out.println("Hai chuỗi khác nhau.");
        }

    }
}
