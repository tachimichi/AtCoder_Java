package ABC209.\u63d0\u51fa\u7528;

import java.util.Scanner;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
		File file = new File("../txt/B.txt");
		Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ---------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] num = new int[a];
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
            // System.out.println(num[i]);
        }
        scan.close();
        // System.out.println(num);
        for (int i = 0; i < a; i++) {
            if (i % 2 == 1) {
                num[i]--;
            }
            b -= num[i];
        }
        if (b < 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
