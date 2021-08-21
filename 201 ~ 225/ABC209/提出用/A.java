package ABC209.\u63d0\u51fa\u7528;

import java.util.Scanner;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int ans = 0;
        for (int i = a; i <= b; i++) {
            ans++;
        }
        System.out.println(ans);
    }
}
