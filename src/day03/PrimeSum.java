package day03;

/**
 * @Author: whh
 * Description:100以内的质数求和
 * @Data:Create in 18:40 2020/6/17
 * Nodified By:
 */
public class PrimeSum {
    public static void main(String[] args) {
        int sum = 2;
        boolean bool = false;
        for (int i=3;i<=100;i++){
            bool = isPrime(i,bool);
            if (bool){
                sum += i;
                bool = false;
            }
        }
        System.out.println("100以内的质数的和为："+sum);
    }
    
    /**
      *判断是否为质数
      */
    public static boolean isPrime(int x,boolean bool){
        //质数：一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数
        for (int i=2;i<x;i++){
            if (x%i == 0){
                break;
            }
            if (i==x-1){
                bool = true;
            }
        }
        return bool;
    }
}
