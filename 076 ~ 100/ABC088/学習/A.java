
import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/A.txt");
        Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ------------------------------------------------
        int n = scan.nextInt();
        int a = scan.nextInt();
        scan.close();

        int amari = n % 500;
        if(amari <= a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
