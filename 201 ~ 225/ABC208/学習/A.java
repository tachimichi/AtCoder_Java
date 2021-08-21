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
        sc.close();

        // * NG例：a:3, b:2のケース
        if (a <= b && b <= a * 6) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
