/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ChararrayReaderr;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
public class arrayreaderEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String origin_text = "data.txt";
        char char_array[] = origin_text.toCharArray();
        
        CharArrayReader r = new CharArrayReader(char_array);
        CharArrayWriter w = new CharArrayWriter();
        
        int code;
        while((code = r.read()) != -1){
            if(code >= 48 && code <= 57){
                w.write(code);
            }
        }
        char new_char_array[] = w.toCharArray();
        System.out.println(new_char_array);
        
        String new_text = w.toString();
        System.out.println(new_text);
    }
    
}
