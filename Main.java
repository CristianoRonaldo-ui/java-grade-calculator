import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print(" Nhập số lượng học sinh : ");
        int numberOfStudents = scanner .nextInt();

        double[] scores = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) { 
            System.out.print("Nhập điểm học sinh " +(i+1) + ": ");
            scores[i] = scanner.nextDouble();  
        }
        double sum = 0; 
        for (int i = 0; i < numberOfStudents; i++) {
            sum = sum + scores[i];
        }
        double average = sum / numberOfStudents;
        System.out.println("Điểm trung bình của lớp là: " + average);

        double max = scores[0];
        double min = scores[0];

        for ( int i = 1; i < numberOfStudents; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("Điểm cao nhất của cả lớp là: " + max);
        System.out.println("Điểm thấp nhất của cả lớp là: " + min);

        String grade; 

        if (average >= 90) {
            grade = "Tuất";
        } else if (average >= 80) {
            grade = "Khê lắm";
        }else if (average >= 70) {
            grade = "Chưa tài";
        }else if (average >= 60) {
            grade = "Nghỉ cho nó mát";
        }else {
            grade = "Mở cửa cho anh đê";
        }

        System.out.println("Xếp loại cả lớp là: " + grade);

        System.out.println("Đã nhập xong điểm của " + numberOfStudents + " tuất.");

        
    }
    
}
