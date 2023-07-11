import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] intArray = new int[rows][columns];

        for(int i = 0 ; i<rows ; i++){
            for (int j = 0; j<columns ; j++){
                intArray[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0 ; i<rows ; i++){
            for (int j = 0; j<columns ; j++){
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
