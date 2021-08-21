import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        // * 配列もString型で格納する
        String a[] = new String[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.next();
        }
        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].equals(a[i + 1])) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
