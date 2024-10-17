import java.util.Scanner;

public class GradeCalculator {

    public static double getGradePoint(String grade) {
        switch (grade.toUpperCase()) {
            case "A":
            case "A+":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D+":
                return 1.5;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            case "W":  // Withdraw, không tính điểm
            case "R":  // Repeat, không tính điểm
                return 0; // Sử dụng -2 để biểu thị điểm không được tính
            default:
                return 0; // Invalid grade
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grades (one per line), finish with an empty line:");

        String grade;
        while (true) {
            grade = scanner.nextLine();
            if (grade.isEmpty()) {  // Kết thúc nhập khi dòng trống
                break;
            }

            double point = getGradePoint(grade);
            System.out.println(point);
        }

        scanner.close();
    }
}
