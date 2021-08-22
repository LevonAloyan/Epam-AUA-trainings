package com.company.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:/Users/User/Desktop/phonenumbergenerator.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PhoneNumberGenerator phoneNumberGenerator = new PhoneNumberGenerator();
        phoneNumberGenerator.writeToFile("C:/Users/User/Desktop/phonenumbergenerator.txt");
    }
}
