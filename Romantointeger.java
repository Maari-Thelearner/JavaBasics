import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Romantointeger {

    public static void main(String[] args){

        Map<Character, Integer> map = new HashMap<Character, Integer>(){{
            put('I' , 1);
            put('V' , 5);
            put('X' , 10);
            put('L' , 50);
            put('C' , 100);
            put('D' , 500);
            put('M' , 1000);
        }};

        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();

        char[] array = roman.toCharArray(); // XII

        int previous = 0;
        int result = 0;

        for (int i = array.length - 1 ; i >= 0 ; i--){
            int current = map.get(array[i]);
            if (previous > current){
                result = result - current;
            }else {
                result = result + current;
            }
            previous = current;
        }

        System.out.println(result);
    }
}
