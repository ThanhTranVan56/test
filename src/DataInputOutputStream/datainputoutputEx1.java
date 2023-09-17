/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DataInputOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class datainputoutputEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        String fileName = "file.bat";
        DataOutputStream dout = new DataOutputStream(new FileOutputStream(fileName));
        dout.writeDouble(1.1);
        dout.writeInt(55);
        dout.writeBoolean(true);
        dout.writeChar('4');
        
        DataInputStream din = new DataInputStream(new FileInputStream(fileName));
        int a = din.readInt();
        double b = din.readDouble();
        boolean c = din.readBoolean();
        char d = din.readChar();
        System.out.println("Value: " + a + " " + b + " " + c + " " + d);
    }
}
    
