package ABC209.\u5b66\u7fd2;

import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
		File file = new File("../txt/A.txt");
		Scanner scan = new Scanner(file);
        //* ------------------------------------------------
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
