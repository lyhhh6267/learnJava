package bignum;

import java.math.BigInteger;

/**
 * @author Lyh
 * @date 2021/10/16 22:47
 */
public class BigIntegerMethod01 {
    public static void main(String[] args) {
        long l = 238888888;
        System.out.println(l);

        //当编程中需要处理很大的数，long不够用
        //可以使用BIgInteger类
        BigInteger bigInteger = new BigInteger("233333333333333333333333333333333");
        System.out.println(bigInteger);
        //使用加减乘除要是用对应方法，不能直接运算
    }
}
