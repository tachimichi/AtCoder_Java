import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        int n = scan.nextInt();
        scan.close();
        if (n >= 212) {
            System.out.println(8);
        } else if (n <= 125) {
            System.out.println(4);
        } else {
            System.out.println(6);
        }

    }
}
