import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
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
