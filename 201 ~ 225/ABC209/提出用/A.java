package ABC209.\u63d0\u51fa\u7528;

import java.util.Scanner;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
		File file = new File("../txt/A.txt");
		Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ---------------------------
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

        int ans = 0;
        for(int i = a; i <= b; i++) {
            ans++;
        }
        System.out.println(ans);
    }
}
