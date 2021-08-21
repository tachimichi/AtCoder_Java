import java.util.Scanner;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int n = sc.nextInt();
        String a[] = new String[n];

        String ans = "Three";
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
            // System.out.println(a[i]);
            if (a[i].equals("Y")) {
                ans = "Four";
                // System.out.println(a[i]);
            }
        }
        sc.close();
        System.out.println(ans);
    }
}
