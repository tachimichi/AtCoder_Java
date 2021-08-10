import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // * 提出用のscan
        // * ------------------------------------------------
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
