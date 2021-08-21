import java.util.Scanner;
import java.util.*;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int a[] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);
        System.out.println(a[2] + a[1]);
    }
}
