import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ---------------------------
        int n = scan.nextInt();
        int a = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();

        int ans;
        if(n > a) {
            ans = a * x + (n - a) * y;
        } else {
            ans = n * x;
        }
        System.out.println(ans);
    }
}
