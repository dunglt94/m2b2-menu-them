import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Tính tổng các số lẻ từ 1 - n và in ra màn hình.");
        System.out.println("2. Kiểm tra xem n có phải số nguyên tố hay không");
        System.out.println("3. In ra số ngày trong tháng n");
        System.out.println("4. Thoát");
        System.out.print("Chọn: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Tính tổng các số lẻ từ 1 - n và in ra màn hình.");
                System.out.print("Nhập số (> 10 và < 100): ");
                int n1 = scanner.nextInt();
                while (n1 <= 10 || n1 >= 100) {
                    System.out.print("Nhập lại số (> 10 và < 100): ");
                    n1 = scanner.nextInt();
                }
                int sum = 0;
                for (int i = 1; i <= n1 ; i++) {
                    if (i % 2 != 0) {
                        sum += i;
                    }
                }
                System.out.println("Tổng các số lẻ từ 1 đến "+ n1 + ": " + sum);
                break;
            case 2:
                System.out.println("Kiểm tra xem n có phải số nguyên tố hay không");
                System.out.print("Nhập số: ");
                int n2 = scanner.nextInt();
                while (n2 <= 0) {
                    System.out.print("Nhập số (phải 0): ");
                    n2 = scanner.nextInt();
                }
                if (n2 < 2){
                    System.out.println(n2 + " không phải là số nguyên tố");
                } else {
                    int i = 2;
                    boolean check = true;
                    while (i <= Math.sqrt(n2)) {
                        if (n2 % i == 0) {
                            check = false;
                            break;
                        }
                        i++;
                    }
                    if (check)
                        System.out.println(n2 + " là số nguyên tố");
                    else
                        System.out.println(n2 + " không phải là số nguyên tố");
                }
                break;
            case 3:
                System.out.println("In ra số ngày trong tháng n");
                System.out.print("Nhập tháng 1 - 12: ");
                int n3 = scanner.nextInt();
                while (n3 < 1 || n3 > 12) {
                    System.out.print("Nhập lại: ");
                    n3 = scanner.nextInt();
                }
                switch (n3) {
                    case 2:
                        System.out.println("Tháng " + n3 + " có 28 hoặc 29 ngày.");
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("Tháng " + n3 + " có 31 ngày.");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Tháng " + n3 + " có 30 ngày.");
                        break;
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}
