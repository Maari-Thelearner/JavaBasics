import java.util.Scanner;

public class JaggedArray {

    public static void main(String... args){
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int columns = sc.nextInt();
//        int[][] arg = new int[rows][columns];
//
//        for(int i = 0 ; i< rows ; i++){
//            for (int j = 0; j<columns ; j++){
//                System.out.print("arg[" + i + "][" + j +"] = ");
//                arg[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i = 0 ; i< rows ; i++){
//            for (int j = 0; j<columns ; j++){
//                System.out.print((arg[i][j] * 5) + " ");
//            }
//            System.out.println();
//        }
//        int rows = 10;
//        int cols = 1;
//        for (int i = 0 ; i<rows ; i++){
//            for(int j = 0 ; j < cols ; j++){
//                System.out.print("* ");
//            }
//            cols++;
//            System.out.println();
//        }

        int rows = 3;

        // loop to iterate for the given number of rows
        for (int i = 1; i <= rows; i++) {

            // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }

            // loop to print the number of stars in each row
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }

            // for new line after printing each row
            System.out.println();
        }
    }
}
