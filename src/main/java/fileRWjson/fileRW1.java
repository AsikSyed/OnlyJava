package fileRWjson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileRW1 {
    public static void main(String[] args) throws IOException {
        fileWrite();
        fileRead();

    }
    public static void fileWrite() throws IOException {
        FileWriter fw= new FileWriter("myfile.txt",true);
        fw.write("\n the person with rare attitude. ");
        fw.close();
    }
    public static void fileRead() throws IOException {
        FileReader fR= new FileReader("myfile.txt");
        int character;
//        while ((character=fR.read()) !=-1){
//            System.out.println((char) character);
//        }
        System.out.println(fR.read());
        fR.close();
    }
}
