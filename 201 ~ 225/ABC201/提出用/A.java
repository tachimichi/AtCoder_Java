import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);

        if (a[1] - a[0] == a[2] - a[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
