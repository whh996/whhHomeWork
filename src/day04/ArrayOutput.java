package day04;

import java.util.Scanner;

/**
 * @Author: whh
 * Description:一个大的数组其元素按奇偶存入两个数组并交替输出
 * @Data:Create in 22:43 2020/6/18
 * Nodified By:
 */
public class ArrayOutput {
    public static void main(String[] args) {
        //从键盘输入8个整数存放在一个数组中
        Scanner sc = new Scanner(System.in);

        //int [] bigArray;
        //bigArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int [] bigArray = new int[8];
        System.out.println("您需要输入8个整数！");
        for (int i=0;i<bigArray.length;i++){
            System.out.print("请输入第"+(i+1)+"个整数：");
            bigArray[i] = sc.nextInt();
        }

        //定义存储奇数和偶数的数组的长度
        int [] number = oddOrEven(bigArray);
        int [] odd = new int[number[1]];  //奇数个数
        int [] even = new int[number[0]];  //偶数个数

        //判断奇偶并分别存入数组
        int j=0,k=0;
        for (int i=0;i<bigArray.length;i++) {
            if (bigArray[i]%2==0) {
                even[j] = bigArray[i];
                j++;
            }else {
                odd[k] = bigArray[i];
                k++;
            }
        }

        //调用方法奇偶交替输出
        System.out.println("奇偶交替输出为：");
        outPut(odd,even);


    }

    /**
     * 奇数和偶数数组交替输出
     * @param odd
     * @param even
     */
    private static void outPut(int[] odd, int[] even) {
        if (odd.length>=even.length){  //奇数偶数个数相等，先输出奇数
            for (int i=0;i<odd.length;i++){
                System.out.print(odd[i]+" ");
                while (i<even.length){
                    System.out.print(even[i]+" ");
                    break;
                }
            }
        }else {
            for (int i=0;i<even.length;i++){
                System.out.print(even[i]+" ");
                while (i<odd.length){
                    System.out.print(odd[i]+" ");
                    break;
                }
            }
        }
    }


    /**
     * 判断奇偶并定义存储奇数和偶数的数组的长度
     * @param bigArray
     * @return
     */
    private static int[] oddOrEven(int[] bigArray) {

        int [] number = new int[2];
        for (int i=0;i<bigArray.length;i++) {
            if (bigArray[i]%2==0) {
                number[0]++;
            }else {
                number[1]++;
            }
        }
        return number;
    }
}
