import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        String s = sc.next();
        String ac = "Hello,World!";
        sc.close();

        // System.out.println(ac);
        if (s.equals(ac)) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}
