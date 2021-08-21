import java.util.*;
import java.io.*;

public class C {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/C.txt");
        Scanner sc = new Scanner(file);
        // * 学習用sc
        // * ---------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);
        sc.close();

        // * cが偶数であれば、aやbの片方が負だろうとイコールになるため
        // * 絶対値で処理する
        if (c % 2 == 1) {
            if (a == b) {
                System.out.println("=");
            } else if (a > b) {
                System.out.println(">");
            } else {
                System.out.println("<");
            }
        } else {
            if (absA == absB) {
                System.out.println("=");
            } else if (absA > absB) {
                System.out.println(">");
            } else {
                System.out.println("<");
            }
        }
    }
}
