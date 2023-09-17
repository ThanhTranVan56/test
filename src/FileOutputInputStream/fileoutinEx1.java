/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileOutputInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutinEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("inp.txt");
            out = new FileOutputStream("out.txt");
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } finally {
            if( in != null){
                in.close();
            }
            if( out != null){
                out.close();
            }
        }
    }
    
}
