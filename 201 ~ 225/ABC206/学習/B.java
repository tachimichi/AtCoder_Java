import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        int sum = 0;
        while (sum < n) {
            count++;
            sum += count;
        }
        System.out.println(count);
    }
}
