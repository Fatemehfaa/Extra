package org.example.extra.base64.stringBase64;

import java.util.Base64;

public class EncodeData {
    public static void main(String[] args) {

        String string = "This is test for base64.";
        Base64.Encoder encoder = Base64.getEncoder();

        String encodedToString = encoder.encodeToString(string.getBytes());

        System.out.println("Encoded String: " + encodedToString);
    }
}
