import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ---------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();

        int ans = -1;
        if(c*d - b <= 0) {
            System.out.println(ans);
        } else {
            double n = c*d -b;
            // System.out.println(n);
            // System.out.println(a / n);
            System.out.println((int)Math.ceil(a / n));
        }
    }
}
