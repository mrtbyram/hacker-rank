package tr.org.exercise.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by muratbayram on 17/04/2017.
 */
public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        long total = 0;
        for (int number : arr) {
            total += number;
        }
        System.out.println(total);
    }

}
