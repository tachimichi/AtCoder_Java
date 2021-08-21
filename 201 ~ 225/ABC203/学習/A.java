import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ------------------------------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(a);
        } else if (a == c) {
            System.out.println(b);
        } else {
            System.out.println(0);
        }

    }
}
