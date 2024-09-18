import java.util.Scanner;

public class CalculatorDay {
    /*
        Nhập năm và tháng trả về số ngày trong tháng
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y, m, d;
        System.out.print("Input year: ");
        y = sc.nextInt();
        System.out.print("Input month: ");
        m = sc.nextInt();

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                d = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                d = 30;
                break;
            case 2:
                d = getYear(y);
                break;
            default:
                System.out.println("Input incorrect!");
                return;
        }

        System.out.println("Month " + m + " of year " + y + " has " + d + " days.");

        sc.close();
    }
    /*
        Kiểm tra xem năm nhuận hay không
        Trả về 29 nếu năm nhuận, 28 nếu không phải
     */
    public static int getYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 ==0) ? 29 : 28;
    }
}