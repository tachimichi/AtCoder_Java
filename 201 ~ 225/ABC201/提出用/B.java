import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // * 提出用のscan
        // * ------------------------------------------------
        int n = scan.nextInt();
        //* String型として、標準入力
        //* 配列もString型で格納する
        String strNum = scan.next();
        String a[] = strNum.split("");
        
        for(int i =0; i < n; i++) {
            if(a[i].equals("1")) {
                if(i % 2 == 0) {
                    System.out.println("Takahashi");
                } else {
                    System.out.println("Aoki");
                }
                //* もし1を発見できた場合
                break;
            }
        }
    }
}
