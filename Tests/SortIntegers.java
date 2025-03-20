package Tests;
import java.util.Arrays;
import java.util.Collections;
public class SortIntegers {
    public static void main(String[] args){
        Integer num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.sort( num, Collections.reverseOrder());
        System.out.println(Arrays.toString(num));
    }

}
