/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ByteArrayInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
public class arrayinputEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        byte[] byteArray = {65, 66, 67, 68, 69};
        
        try{
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            
            int data;
            while((data = byteArrayInputStream.read()) != -1){
                System.out.print((char) data);
            }
            byteArrayInputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
