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
        sc.close();

        int ans = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                int x = i * 100 + j;
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
