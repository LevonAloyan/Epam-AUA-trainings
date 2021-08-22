package com.company.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PhoneNumberGenerator {
        public boolean writeToFile(String writeToFile) {
                PrintWriter output = null;

                try {
                        output = new PrintWriter(new FileOutputStream(writeToFile));

                } catch (FileNotFoundException e) {
                        return false;
                }


                for (int i = 0; i < 1000000; i++) {
                        if (i%10 == 0){
                                output.println();
                        }

                        if (i < 10){
                                output.print("07700000" + i + " ");
                        }
                        else if (i < 100){
                                output.print("0770000" + i + " ");
                        }
                        else if (i < 1000){
                                output.print("077000" + i + " ");
                        }
                        else if (i < 10000){
                                output.print("07700" + i + " ");
                        }
                        else if (i < 100000){
                                output.print("0770" + i + " ");
                        }
                        else if (i < 1000000){
                                output.print("077" + i + " ");
                        }


                }

                output.close();
                return true;
        }

}
