package org.example.extra.base64.fileBase64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class EncodeFile {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\Nezamvazifeh.Medical\\reactapp\\src\\test\\java\\ir\\jame\\reactapp\\test\\files/test.txt";

        try {
            Path path = Paths.get(filePath);
            if (!Files.exists(path)) {
                System.out.println("File does not exist: " + filePath);
                return;
            }

        byte[] bytes = Files.readAllBytes(Paths.get(filePath));

        Base64.Encoder encoder = Base64.getEncoder();
        String encodedToString = encoder.encodeToString(bytes);

        System.out.println("encodedToString: " + encodedToString);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
