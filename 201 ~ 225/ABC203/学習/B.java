import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

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
