import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int n = sc.nextInt();
        int[] a = new int[n];
        // map(キー、値)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int list = i;
            a[i] = score;
            map.put(score, list);
        }
        sc.close();

        Arrays.sort(a);
        // System.out.println(a[a.length-2]);
        System.out.println(map.get(a[a.length - 2]) + 1);
    }
}
