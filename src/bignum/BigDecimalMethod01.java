package bignum;

import java.math.BigDecimal;

/**
 * @author Lyh
 * @date 2021/10/16 22:52
 */
public class BigDecimalMethod01 {
    public static void main(String[] args) {
        double d = 199.11111111111111111111111111111311;
        System.out.println(d);
        //当我们需要一个很高精度的数时，double不够用，可以用BigDecimal
        BigDecimal bigDecimal = new BigDecimal("199.1231231111111111111111111111111111222");
        System.out.println(bigDecimal);
        //和BIgInteger一样不能直接加减乘除
        //在调用除法的方法时，指定精度，如果有无限循环小数，只保留分子的精度
    }
}
