import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10) {
                int x = a[i] - 10;
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
