package tr.org.exercise.algorithm.warmup;

import java.util.Scanner;

/**
 * Created by muratbayram on 17/04/2017.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int d1=0;
        int d2=0;
        n-=1;
        for(int i=0; i<=n; i++){
            d1+=a[i][i];
            d2+=a[i][n-i];
        }
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1<d2 ? d2-d1 : d1-d2);
    }
}
