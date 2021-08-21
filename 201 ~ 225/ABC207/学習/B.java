import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
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
