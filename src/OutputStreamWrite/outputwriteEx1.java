/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OutputStreamWrite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;
public class outputwriteEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String path = "data.txt";
        byte b[] = new byte[15];
        File file = new File(path);
        OutputStream os = new FileOutputStream(file);
        os.write(73);
        os.write((int) 'T');
        String s = "HUTECH-ILOVE";
        char c[] = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            b[i] = (byte) c[i];
        }
        
        os.write(b);
        os.close();
    }
    
}
