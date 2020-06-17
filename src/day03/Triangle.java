package day03;

import java.util.Scanner;

/**
 * @Author: whh
 * Description:三角形（Triangle）
 * @Data:Create in 15:43 2020/6/17
 * Nodified By:
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入等腰三角形高度：");
        int n = sc.nextInt();
        Isosceles(n);
    }

    public static void  Isosceles(int n){  // isosceles triangle:等腰三角形
        /*
            *
           ***
          *****
         *******
         */
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){  //控制空格数
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){  //控制*数
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
