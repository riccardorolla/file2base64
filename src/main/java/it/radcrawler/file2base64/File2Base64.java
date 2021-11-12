
package it.radcrawler.file2base64;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.binary.Base64;
 
 
import org.apache.commons.io.FileUtils;


public class File2Base64 {
    public static void main(String[] args) {
    File file = new File(args[0]);
    byte[] encoded;
        try {
            encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
              System.out.println(new String(encoded, StandardCharsets.US_ASCII));
        } catch (IOException ex) {
            System.err.println("exception:"+ex.getMessage());
        }
  

}
}
