package org.example.extra.base64.pictureBase64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class EncodePicture {
    public static void main(String[] args) throws IOException {


        String imagePath = "C:\\Users\\Mahdi\\Pictures\\Saved Pictures/-astronaut-floating-space-wallpaper-2560x1440-wallpaper.jpg";

        byte[] readAllBytes = Files.readAllBytes(Paths.get(imagePath));
        Base64.Encoder encoder = Base64.getEncoder();

        String encodedToString = encoder.encodeToString(readAllBytes);
        System.out.println("Encoded String: " + encodedToString);
    }
}
