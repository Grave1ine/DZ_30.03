package Task3;

import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayUtil {

    public void min(int[] array){
        Arrays.sort(array);
        System.out.println("минимальнео число: " + array[0]);
    }

    public void max(int[] array){
        Arrays.sort(array);
        int i = array.length;
        System.out.println("максимальное число: " + array[i-1]);
    }
}
