package filehandling;

import java.io.*;

//Byte Stream
//Character stream

public class FileHandlingDemo {
    public static void main(String[] args) {

        File file = new File("FHDemo.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            String str = "Wel-Come to India";
            byte[] bt = str.getBytes();

            fileOutputStream.write(bt);
//uiiyiu
            System.out.println("saved..!");
            System.out.println(file.length());
        }  catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            fileOutputStream.close();
//        }


        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
