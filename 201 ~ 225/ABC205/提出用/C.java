import java.util.*;
import java.io.*;

public class C {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        //* cが偶数であれば、aやbの片方が負だろうとイコールになるため
        //* 絶対値で処理する
        if(c % 2 == 1) {
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
