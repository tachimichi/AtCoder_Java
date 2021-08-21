import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (b == 0) {
            System.out.println("Gold");
        } else if (a == 0) {
            System.out.println("Silver");
        } else {
            System.out.println("Alloy");
        }
    }
}
