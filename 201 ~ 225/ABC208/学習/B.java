import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int p = sc.nextInt();
        sc.close();

        int x = 1;
        for (int i = 1; i <= 10; i++) {
            x *= i;
        }

        int ans = 0;
        for (int i = 10; i > 0; i--) {
            // * 少数切り捨て
            ans += p / x;
            // * 余りを次の計算用として格納する
            p %= x;
            // * 次の硬貨へ変更する
            x /= i;
        }
        System.out.println(ans);
    }
}
