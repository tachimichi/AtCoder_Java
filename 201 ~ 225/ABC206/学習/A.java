import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ------------------------------------------------
        int a = sc.nextInt();
        sc.close();
        // Math.floorは型変換が複雑になる
        int n = (int) (a * 1.08);
        System.out.println(n);
        if (n < 206) {
            System.out.println("Yay!");
        } else if (n == 206) {
            System.out.println("so-so");
        } else {
            System.out.println(":(");
        }
    }
}
