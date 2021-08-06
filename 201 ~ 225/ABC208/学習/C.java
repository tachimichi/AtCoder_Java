import java.util.*;
import java.io.*;

public class C {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/C.txt");
        Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ---------------------------
        int n = scan.nextInt();
        long k = scan.nextLong();
        // System.out.println(n);
        // System.out.println(k);
        int[] a = new int[n];
        int[] copy = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            copy[i] = a[i];
            // System.out.println(a[i]);
            // System.out.println(copy[i]);
        }
        scan.close();
        //* -------------------
        Arrays.sort(copy);
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(copy));
        
        long ans = k / (long)n;
        long mod = k % (long)n;
        // System.out.println(mod);
        for (int i = 0; i < n; i++) {
            if(mod == 0) {
                System.out.println(ans);
            } else {
                if(a[i] <= copy[(int)mod - 1]) {
                    System.out.println(ans + 1);
                } else {
                    System.out.println(ans);
                }
            }
        }
    }
}
