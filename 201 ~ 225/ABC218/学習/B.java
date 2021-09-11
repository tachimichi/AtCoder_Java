import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        int[] x = new int[26];
        for (int i = 0; i < 26; i++) {
            x[i] = sc.nextInt();
        }

        String[] ans = new String[26];
        for (int i = 0; i < x.length; i++) {
            ans[i] = alphabet[x[i] - 1];
            System.out.print(ans[i]);
        }
    }
}
