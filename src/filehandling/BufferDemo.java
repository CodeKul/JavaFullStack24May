package filehandling;

import java.io.*;

public class BufferDemo extends Object{

    private static void buffer(){
        try (OutputStream fileOutputStream = new FileOutputStream("sample.txt");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

            String str = "Good Morning";
            byte[] bt = str.getBytes();
            bufferedOutputStream.write(bt);

            bufferedOutputStream.close();
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("sample.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

            int i = bufferedInputStream.read();
            while (i > 0) {
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void main(String[] args) {
       buffer();
    }
}
