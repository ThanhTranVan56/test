/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class filereaderEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("data.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
    
}
