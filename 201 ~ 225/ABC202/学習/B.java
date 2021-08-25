import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        String a[] = sc.next().split("");
        String ans[] = new String[a.length];
        sc.close();

        for (int i = 0; i < a.length; i++) {
            ans[i] = a[a.length - 1 - i];
        }
        // System.out.println(Arrays.toString(ans));

        for (int i = 0; i < a.length; i++) {
            if (ans[i].equals("6")) {
                ans[i] = "9";
            } else if (ans[i].equals("9")) {
                ans[i] = "6";
            }
        }
        System.out.println(Arrays.toString(ans).join("", ans));
    }
}
