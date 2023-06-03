package com.corejava.inputstream;

import java.io.*;

/**
 * 抽象类InputStream和OutputStream构成了输入/输出(I/O)的层次结构的根节点
 */
public class InputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Chapter_IO/news.txt");
        /*
            readAllBytes() 一次读取流中所有的字节
         */
        byte[] bytes = fis.readAllBytes();
        String string = new String(bytes);
        System.out.println("string = " + string);

        /*
            输出流一次写出一个字节数组
         */
        FileOutputStream fos = new FileOutputStream("chapter_IO/copy.txt");
        fos.write(bytes);
    }
}
