package com.company.io;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class IOTester {
  public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
    //
      String filename = "phonebook.txt";
      new PhoneNumberGenerator().generateBeelineNumbers(1000000, filename);
  }
}
