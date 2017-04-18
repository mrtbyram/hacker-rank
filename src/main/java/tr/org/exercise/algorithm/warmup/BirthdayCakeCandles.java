package tr.org.exercise.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by muratbayram on 18/04/2017.
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }

        int max = 0;
        int count = 0;
        for(int h : height){
            if(h < max) continue;
            if(h == max) count++;
            if(h>max){
                max=h;
                count=1;
            }
        }
        System.out.println(count);
    }
}
