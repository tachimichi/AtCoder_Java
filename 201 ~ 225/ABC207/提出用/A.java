import java.util.Scanner;
import java.util.*;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int a[] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        Arrays.sort(a);
        System.out.println(a[2] + a[1]);
    }
}
