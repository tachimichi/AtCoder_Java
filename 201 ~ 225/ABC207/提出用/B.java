import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int ans = -1;
        if (c * d - b <= 0) {
            System.out.println(ans);
        } else {
            double n = c * d - b;
            // System.out.println(n);
            // System.out.println(a / n);
            System.out.println((int) Math.ceil(a / n));
        }
    }
}
