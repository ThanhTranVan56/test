/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OutputStreamWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class outputstreamEx11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "data.txt";
        File file = new File(path);
        FileOutputStream fos = new FileOutputStream(file);
        
        fos.write(73);
        fos.write((int)'T');
        String s = "HUTECH";
        byte b[] = s.getBytes();
        fos.write(b);
        fos.close();
    }
    
}
