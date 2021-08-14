import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // * 提出用のscan
        // * ------------------------------------------------
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
