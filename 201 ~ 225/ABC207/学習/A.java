import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ------------------------------------------------
        int a[] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);
        System.out.println(a[2] + a[1]);
    }
}
