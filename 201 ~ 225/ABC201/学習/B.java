import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        int n = scan.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            int num = scan.nextInt();
            map.put(str, num);
        }
        scan.close();
        System.out.println(map);

    }
}
