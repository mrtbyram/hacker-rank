package tr.org.exercise.algorithm.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by muratbayram on 18/04/2017.
 */
public class ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(factorial(n));
    }

    private static BigInteger factorial(int n){
        if(n==1) return BigInteger.valueOf(1);
        return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }
}
