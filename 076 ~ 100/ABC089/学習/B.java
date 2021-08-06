import java.util.Scanner;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ---------------------------
        int n = scan.nextInt();
        String a[] = new String[n];

        String ans = "Three";
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.next();
            // System.out.println(a[i]);
            if(a[i].equals("Y")) {
                ans = "Four";
                // System.out.println(a[i]);
            }
        }
        scan.close();
        System.out.println(ans);
    }
}
