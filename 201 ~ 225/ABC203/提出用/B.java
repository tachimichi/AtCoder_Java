import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // * 提出用のscan
        // * ------------------------------------------------
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
