import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ---------------------------

        // 排他的論理和(xor)：^
        // 論理積(and)：&
        // 論理和(or)：|
        // 反転(not)：~
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int xor = a ^ b;
        System.out.println(xor);

        // int x = Integer.parseInt(Integer.toBinaryString(a));
        // int y = Integer.parseInt(Integer.toBinaryString(b));
        // System.out.println(x);
        // System.out.println(y);
    }
}
