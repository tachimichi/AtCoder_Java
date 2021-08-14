import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        int s = scan.nextInt();
        int t = scan.nextInt();
        scan.close();
        int count = 0;
        for (int i = 0; i <= s; i++) {
            for (int j = 0; j <= s - i; j++) {
                for (int k = 0; k <= s - (i + j); k++) {
                    if (i * j * k <= t)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
