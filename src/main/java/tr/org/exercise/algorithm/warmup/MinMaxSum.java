package tr.org.exercise.algorithm.warmup;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by muratbayram on 17/04/2017.
 */
public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        List<Long> numbers = Arrays.asList(a,b,c,d,e);
        Collections.sort(numbers);
        BigInteger sum = BigInteger.valueOf(a+b+c+d+e);

        System.out.println(sum.subtract(BigInteger.valueOf(numbers.get(4)))
                +" "
                +sum.subtract(BigInteger.valueOf(numbers.get(0))));
    }
}
