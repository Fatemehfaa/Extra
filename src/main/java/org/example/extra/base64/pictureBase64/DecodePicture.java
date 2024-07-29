package org.example.extra.base64.pictureBase64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Base64;


public class DecodePicture {
    public static void main(String[] args) throws IOException {

        String encodedImage = "encoded String" ;

        Base64.Decoder decoder = Base64.getDecoder();

        byte[] decodedImageBytes = decoder.decode(encodedImage);

        String imagePath = "C:\\Users\\Mahdi\\Pictures\\Saved Pictures/-astronaut-floating-space-wallpaper-2560x1440-wallpaper.jpg";
        Path path = Paths.get(imagePath);

        Files.createDirectories(path.getParent());

        Files.write(path, decodedImageBytes);

        System.out.println("Image file written successfully to: " + imagePath);


    }
}

