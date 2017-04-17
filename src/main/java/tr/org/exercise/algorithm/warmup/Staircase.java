package tr.org.exercise.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by muratbayram on 17/04/2017.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<=n; i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
