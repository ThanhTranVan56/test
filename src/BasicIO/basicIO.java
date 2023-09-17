/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BasicIO;
import java.io.IOException;
public class basicIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte byearr[] = new byte[255];
        try{
            System.err.print("Enter the line of text: ");
            System.in. read(byearr, 0, 255);
            System.out.println("The line types was: ");
            String str = new String(byearr);
            System.out.println(str);
            
        } catch(IOException e){
            System.err.print("Error");
        }
    }
    
    
}
