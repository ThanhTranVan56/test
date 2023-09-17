/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class filereaderEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("data.txt");
        FileReader fis = new FileReader(file);
        int char_code;
        while((char_code = fis.read()) != -1){
            System.out.print((char) char_code + "  " + char_code + "  ");
        }
        fis.close();
    }
    
}
