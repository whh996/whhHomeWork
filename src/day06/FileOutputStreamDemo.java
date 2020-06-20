package day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author: whh
 * Description:
 * @Data:Create in 22:49 2020/6/20
 * Nodified By:
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("a.txt");

        String str = new String();
        str = "hello world";
        for (int i=0;i<str.length();i++){
            int b = (char)str.charAt(i);
            os.write(b);  //输出存入a.txt
        }
    }
}
