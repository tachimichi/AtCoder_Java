import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
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
