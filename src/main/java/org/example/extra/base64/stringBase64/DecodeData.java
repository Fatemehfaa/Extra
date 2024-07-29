package org.example.extra.base64.stringBase64;

import java.util.Base64;

public class DecodeData {
    public static void main(String[] args) {

        String encodedString = "VGhpcyBpcyB0ZXN0IGZvciBiYXNlNjQu";
        Base64.Decoder decoder = Base64.getDecoder();

        byte[] decodeBytes = decoder.decode(encodedString);

        String decodedString = new String(decodeBytes);
        System.out.println("Decoded String: " + decodedString);

    }

}
