import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
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
