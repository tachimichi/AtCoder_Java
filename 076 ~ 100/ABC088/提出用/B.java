import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        //* 昇順ソート
        Arrays.sort(a);

        int ans = 0;
        for(int i = n-1; i >= 0; i--) {
            if(i % 2 == 0) {
                ans +=a[i];
            } else {
                ans -=a[i];
            }
            // System.out.println(ans);
        }
        System.out.println(Math.abs(ans));
    }
}
