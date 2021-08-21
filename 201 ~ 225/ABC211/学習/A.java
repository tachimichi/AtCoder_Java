import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();

        System.out.println((a - b) / 3 + b);
    }
}
