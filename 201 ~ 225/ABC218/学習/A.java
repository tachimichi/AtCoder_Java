import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int n = sc.nextInt();
        String[] weather = sc.next().split("");
        sc.close();
        System.out.println(weather[n - 1].equals("o") ? "Yes" : "No");
    }
}
