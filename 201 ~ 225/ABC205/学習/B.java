import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        int n = scan.nextInt();
        int[] a = new int[n];
        long f = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            // f *= a[i];
        }
        // System.out.println(f);
        scan.close();

        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == i + 1)
                count++;
        }

        if (count == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
