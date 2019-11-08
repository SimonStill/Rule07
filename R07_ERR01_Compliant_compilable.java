/******************************************************************************
 *  Rule07 - ERR01
 *  Compliant
 ******************************************************************************/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File; 

public class R07_ERR01_Compliant_Compilable{
    public static void main(String[] args) throws IOException { 
        File file = null;
        try {
            file = new File(System.getenv("APPDATA") + args[0]).getCanonicalFile();
            
            if (!file.getPath().startsWith("c:\\homepath")) {
                System.out.println("Invalid file");
                return;
            }
        } 
        catch (IOException x) {
            System.out.println("Invalid file");
            return;
        }
 
        try {
            FileInputStream fis = new FileInputStream(file);
        } 
        catch (FileNotFoundException x) {
            System.out.println("Invalid file");
            return;
        }
    }
}



