import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int n = sc.nextInt();
        // * String型として、標準入力
        // * 配列もString型で格納する
        String strNum = sc.next();
        String a[] = strNum.split("");

        for (int i = 0; i < n; i++) {
            if (a[i].equals("1")) {
                if (i % 2 == 0) {
                    System.out.println("Takahashi");
                } else {
                    System.out.println("Aoki");
                }
                // * もし1を発見できた場合
                break;
            }
        }
    }
}
