import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
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
