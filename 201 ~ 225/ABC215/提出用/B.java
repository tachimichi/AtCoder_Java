import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        long n = sc.nextLong();
        sc.close();

        long ans = 0;
        long a = 2;
        while (a <= n) {
            a *= 2;
            ans++;
            // System.out.println(a);

        }
        System.out.println(ans);
    }
}
