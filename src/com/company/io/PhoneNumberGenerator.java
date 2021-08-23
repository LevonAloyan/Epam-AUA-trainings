import java.io.BufferedWriter;
import java.io.FileWriter;

public class PhoneNumberGenerator {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("number.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        for (long i = 0; i < 1000000;i++) {
            String code = "093";
            if(i < 10)
                buffer.write(code + "00000" + i);
            else if(i < 100)
                buffer.write(code + "0000" + i);
            else if(i < 1000)
                buffer.write(code + "000" + i);
            else if (i < 10000)
                buffer.write(code + "00" + i);
            else if(i < 100000)
                buffer.write(code + "0" + i);
            else
                buffer.write(code + i);
            buffer.write("\n");
        }
        buffer.close();
        System.out.println("Success");
    }
}
