import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\demo3.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + file.getName());
            } else {
                System.out.println("Dosya zaten mevcut: " + file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        System.out.println("Lütfen isim, soyisim ve yaş giriniz");

        Scanner scanner = new Scanner(System.in);
        String ad = scanner.nextLine();
        String soyad = scanner.nextLine();
        int yas = Integer.parseInt(scanner.nextLine());

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\demo3.txt"));
            bufferedWriter.newLine();//yeni satır ekliyor ve üst üste binmiyor dosyada veri varsa
            bufferedWriter.write("İsim: " + ad + ", Soyisim:" + soyad + ", Yaş: " + yas);
            System.out.println("Bilgiler dosyaya yazıldı...");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }

    public static void readFile() {
        File file = new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\demo3.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
