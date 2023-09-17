/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ByteArrayOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
public class arrayoutputEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
        byte bytes1[] = new byte[]{'H', 'e'};
        os.write(bytes1);
        os.write(108); //'l
        os.write('l'); // code:108
        os.write('o'); // code:111
        byte buffer[] = os.toByteArray();
        for(byte b:buffer){
            System.out.println(b+ "------->" + (char) b);
        }
        os.close();
    }
    
}
