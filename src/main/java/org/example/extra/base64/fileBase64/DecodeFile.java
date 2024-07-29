package org.example.extra.base64.fileBase64;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class DecodeFile {
    public static void main(String[] args) throws IOException {

        String encoded = "VGVzdA0K";
        Base64.Decoder decoder = Base64.getDecoder();

        byte[] decodeFileBytes = decoder.decode(encoded);
        //print text of file
        System.out.println("Decoded bytes: " + new String(decodeFileBytes));


        String filePath = "D:\\Nezamvazifeh.Medical\\reactapp\\src\\test\\java\\ir\\jame\\reactapp\\test\\files/test.txt";
        Path path = Paths.get(filePath);
        Files.createDirectories(path.getParent());

        Files.write(path,decodeFileBytes );
        System.out.println("Path: " + filePath);


    }
}
