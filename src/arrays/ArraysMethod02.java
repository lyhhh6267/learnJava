package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * @author Lyh
 * @date 2021/10/16 22:27
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr ={1,2,90,123,567};
        //二叉搜索，二叉搜索必须是有序的，所以要先排序再搜索
        int index = Arrays.binarySearch(arr,123);
        System.out.println(index);
        //copyOf 数组元素的复制
        Integer[] arr1=Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(arr1));
        //fill 数组填充
        Integer[] num =new Integer[]{9,2,1};
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        //asList 将一组值，转换成list
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println(asList);

    }
}
