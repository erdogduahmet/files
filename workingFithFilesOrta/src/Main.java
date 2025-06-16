import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        readFile();
    }

    public static void fileCreate() {
        File file = new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\metin.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + file.getName());
            } else {
                System.out.println("Dosya zaten mevcuttur: " + file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fileWriter() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\metin.txt", true));
            bufferedWriter.newLine();
            bufferedWriter.write("Ahmet nerede" + "\n Ahmet iş arıyor");
            System.out.println("Dosyaya yazıldı");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(){
    File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\metin.txt");
        try {
            Scanner reader=new Scanner(file);
            while (reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
