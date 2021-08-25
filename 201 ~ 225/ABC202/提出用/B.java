import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        String a[] = sc.next().split("");
        String ans[] = new String[a.length];
        sc.close();

        for (int i = 0; i < a.length; i++) {
            ans[i] = a[a.length - 1 - i];
        }
        // System.out.println(Arrays.toString(ans));

        for (int i = 0; i < ans.length; i++) {
            if (ans[i].equals("6")) {
                ans[i] = "9";
            } else if (ans[i].equals("9")) {
                ans[i] = "6";
            }
        }
        System.out.println(Arrays.toString(ans).join("", ans));
    }
}
