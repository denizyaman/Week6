import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("DosyadanSayiOkumaToplama/src/Number.txt");
            BufferedReader input= new BufferedReader(file);
            String line;
            int sumNumber=0;
            while ((line = input.readLine()) != null) {
                sumNumber+=Integer.parseInt(line);

            }
            input.close();
            System.out.println(sumNumber);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}