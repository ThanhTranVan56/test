/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ReadWriterE;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class readerwriterExx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try{
            String file_name = "data.txt";
            String s = "Hello file Rreader-Writer";
            System.out.println("Du lieu ban dau: "+ s);
            
            FileWriter fw = new FileWriter(file_name);
            fw.write(s);
            fw.close();
            
            FileReader fr = new FileReader(file_name);
            StringBuffer sb = new StringBuffer();
            char ca[]= new char[8];
            while((fr.ready())){
                int len = fr.read(ca);
                sb.append(ca,0,len);
            }
            fr.close();
            System.out.println("Du lieu duoc doc: "+ sb);
        } catch(IOException e){
            System.err.print("Error!.");
        }
    }
    
}
