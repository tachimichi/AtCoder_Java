import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        int n = scan.nextInt();
        // 高さを格納する配列
        int[] a = new int[n];
        // map(キー、値)
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            int high = scan.nextInt();
            a[i] = high;
            map.put(high, str);
        }
        scan.close();

        // System.out.println(map);
        Arrays.sort(a);
        // 配列の中身を確認
        // System.out.println(Arrays.toString(a));
        // 配列の要素を指定
        // System.out.println(a[a.length-2]);

        System.out.println(map.get(a[a.length-2]));

    }
}
