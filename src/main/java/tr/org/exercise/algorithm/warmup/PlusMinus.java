package tr.org.exercise.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by muratbayram on 17/04/2017.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        float fp=0;
        float fn=0;
        float fz=0;
        for(int number : arr){
            if(number>0) fp++;
            if(number<0) fn++;
            if(number==0) fz++;
        }
        String zero = String.format("%.6f", 0d);
        System.out.println(fp!=0 ? String.format("%.6f", fp/n) : zero);
        System.out.println(fn!=0 ? String.format("%.6f", fn/n) : zero);
        System.out.println(fz!=0 ? String.format("%.6f", fz/n) : zero);
    }
}
