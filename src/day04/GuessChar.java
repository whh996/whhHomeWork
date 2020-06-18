package day04;

import java.util.Scanner;

/**
 * @Author: whh
 * Description:猜字符小游戏
 * @Data:Create in 22:20 2020/6/18
 * Nodified By:
 */
public class GuessChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char [] input = new char[5];
        System.out.println("您需要输入5个大写字母！");
        for (int i=0;i<input.length;i++){
            System.out.print("请输入第"+(i+1)+"个大写字母：");
            input[i] = sc.next().charAt(0);
        }
        //char [] input = {'A','B','C','D','E'};
        char [] chs = generate();
        for (int i=0;i<chs.length;i++){
            System.out.print(chs[i]+" ");
        }

        int [] result = cheak(input,chs);
        System.out.println("猜对了："+result[0]+"个，位置猜对的有"+result[1]+"个！");
    }

    private static int[] cheak(char[] input, char[] chs) {

        int [] result = new int[2];
        for (int i=0;i<chs.length;i++){
            for (int j=0;j<input.length;j++){
                if (chs[i]==input[j]){
                    result[0]++;  //字符对
                    if (i==j){
                        result[1]++;  //位置对
                    }
                    break;
                }
            }
        }
        return result;
    }

    private static char[] generate() {
        //存生成数组
        char [] chs = new char[5];
        //字母库
        char [] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M'
                ,'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        //记录下标数组
        boolean [] flages = new boolean[letters.length];
        int index = 0;
        for (int i=0;i<chs.length;i++){
            do {  //生成随机下标
                index = (int)(Math.random()*letters.length);
            }while (flages[index]);

            chs[i] = letters[index];
            flages[index] = true;
        }

        return chs;
    }
}
