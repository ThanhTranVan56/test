/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ChararrayReaderr;

import java.io.CharArrayReader;
import java.io.IOException;
public class arrayreaderEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        char char_array[] = new char[]{'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 't', 'e', 'x', 't'};
        CharArrayReader reader = new CharArrayReader(char_array);
        int code;
        while((code = reader.read()) != -1){
            char ch = (char) code;
            System.out.println(ch);
        }
    }
    
}
