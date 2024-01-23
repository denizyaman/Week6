import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static final String pathName ="Notepad/output.txt";
    public static void main(String[] args) {
        readFile();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();
        printFile(metin);
        readFile();
    }
    public static void printFile(String note){
        try {
            PrintWriter output = new PrintWriter(pathName);
            output.print(note);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static void readFile(){
        try {
            FileReader fileReader = new FileReader(pathName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = bufferedReader.readLine();
            System.out.println(okunanMetin);
            bufferedReader.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}