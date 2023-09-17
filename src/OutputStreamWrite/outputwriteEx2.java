/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OutputStreamWrite;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class outputwriteEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        byte byte_array[] = new byte[]{'0', '1', '2', '3', '4', '5', '6', '7', '8'};
        OutputStream os = new ByteArrayOutputStream();
        os.write(byte_array,2,5);
        String s = os.toString();
        System.out.println(s);
        os.close();
    }
    
}
