package day06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author: whh
 * Description:使用I0(字节)流技术实现文件复制a.txt复制到b.txt
 * @Data:Create in 22:43 2020/6/20
 * Nodified By:
 */
public class CopyInIO {
    public static void main(String[] args) throws Exception{

        //字节输入流
        FileInputStream fis = new FileInputStream("a.txt");
        //缓冲字节输入流
        BufferedInputStream bis = new BufferedInputStream(fis);

        //字节输出流
        FileOutputStream fos = new FileOutputStream("b.txt");
        //缓冲字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] b  = new byte[1024*5];//字节流一次读多少
        int len = 0;
        while ((len = bis.read(b))!= -1) {    //是否还有数据
            bos.write(b,0,len);   //从缓存读取数据
        }
        bos.flush();   //缓存没满，强制输出
        System.out.println("文件复制成功！");

        if(bis!=null){
            bis.close();
        }
        if(bos!= null){
            bos.close();
        }
    }
}
