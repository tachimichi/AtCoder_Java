
import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ------------------------------------------------
        int n = sc.nextInt();
        int a = sc.nextInt();
        sc.close();

        int amari = n % 500;
        if (amari <= a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
