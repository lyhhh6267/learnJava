package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Lyh
 * @date 2021/10/16 22:09
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers ={1,20,90};
        //遍历数组
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
        //用sort方法遍历数组
        Integer[] arr = {1,-1,7,0,89};
        System.out.println(Arrays.toString(integers));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Integer[] arr1 = {1,-1,7,0,89};
        Arrays.sort(arr1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 =(Integer) o1;
                Integer i2 =(Integer) o2;
                return i2-i1;
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}
