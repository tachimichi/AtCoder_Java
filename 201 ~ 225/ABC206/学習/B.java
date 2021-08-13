import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ---------------------------
        int n = scan.nextInt();
        int count = 0;
        int sum = 0;
        while(sum < n) {
            count++;
            sum += count;
        }
        System.out.println(count);
    }
}
