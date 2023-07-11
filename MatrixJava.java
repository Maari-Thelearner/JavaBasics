import java.util.Arrays;
import java.util.Scanner;

public class MatrixJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbersOfSubjects = sc.nextInt();
        int[] marks = new int[numbersOfSubjects];
        int total = 0;
        for (int i = 0; i < numbersOfSubjects; i++) {
            marks[i] = sc.nextInt();
            total +=marks[i];
        }
        System.out.println(marks);

    }
}
