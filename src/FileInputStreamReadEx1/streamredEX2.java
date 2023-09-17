/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileInputStreamReadEx1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class streamredEX2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "data.txt";
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        
        byte[] byte_arr = new byte[3];
        int code = -1, count = 0;
        
        while((code = fis.read(byte_arr)) != -1){
            count++;
            System.out.println("-----Read th: " + count + "-----");
            System.out.println(">> Number of byte read: " + code + "\n");
            for (int i = 0; i < code; i++){
                int ma = byte_arr[i] & 0xFF;
                System.out.println(byte_arr[i] + "  " + ma + "  "+ (char)ma);
            }
        }
        fis.close();
    }
    
}
