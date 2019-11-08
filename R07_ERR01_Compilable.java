/******************************************************************************
 *  Rule07 - ERR01
 *
 ******************************************************************************/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class R07_ERR01_Compilable{
    public static void main(String[] args) throws IOException { 
        // Linux stores a user's home directory path in
        // the environment variable $HOME, Windows in %APPDATA%
        try {
            FileInputStream fis = new FileInputStream(System.getenv("APPDATA") + args[0]);
        } 
        catch (FileNotFoundException e) {
            // Log the exception
            throw new IOException("Unable to retrieve file", e);
        }
    }
}



