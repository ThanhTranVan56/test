/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileInputStreamReadEx1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class streamreadEx1 {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        String path = "data.txt";
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        
        int code;
        while((code = fis.read()) != -1){
            char ch = (char) code;
            System.out.println(code + "  " + ch);
        }
        fis.close();
    }
    
}
