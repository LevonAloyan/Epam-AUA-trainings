package com.company.io;

import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class PhoneNumberGenerator {

    private Random random;

    PhoneNumberGenerator() throws NoSuchAlgorithmException {
        random = SecureRandom.getInstanceStrong();
    }
    /**
     * Generates 9-digit phone number for Beeline operator with specified amount.
     * @param amount
     * @param filename
     * @throws IOException
     */
    public void generateBeelineNumbers(int amount, String filename) throws IOException {
       try(FileWriter writer = new FileWriter(filename)){
           int i = 0;
           while(i++<amount){
               writer.write("(099) "+String.format("%06d", random.nextInt(999999))+"\n");
           }
       } catch(IOException e){
           e.printStackTrace();
       }
    }
}
