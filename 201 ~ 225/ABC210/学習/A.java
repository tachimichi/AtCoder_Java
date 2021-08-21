import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int n = sc.nextInt();
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int ans;
        if (n > a) {
            ans = a * x + (n - a) * y;
        } else {
            ans = n * x;
        }
        System.out.println(ans);
    }
}
