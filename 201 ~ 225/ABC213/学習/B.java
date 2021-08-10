import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        int n = scan.nextInt();
        int[] a = new int[n];
        // map(キー、値)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int score = scan.nextInt();
            int list = i;
            a[i] = score;
            map.put(score, list);
        }
        scan.close();

        Arrays.sort(a);
        // System.out.println(a[a.length-2]);
        System.out.println(map.get(a[a.length-2])+1);
    }
}
