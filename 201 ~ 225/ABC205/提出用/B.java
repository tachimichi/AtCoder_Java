import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

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
