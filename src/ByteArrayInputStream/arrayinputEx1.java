/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ByteArrayInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
public class arrayinputEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        byte byte_array[] = new byte[]{84, 104, 105, 115, 32, 105, 115, 32, 116, 101, 120, 116};
        ByteArrayInputStream bais = new ByteArrayInputStream(byte_array);
        int b;
        while((b = bais.read()) != -1){
            char ch = (char) b;
            System.out.println(b + "  " + ch);
        }
    }
    
}
