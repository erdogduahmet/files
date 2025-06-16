import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	createFile();
    readFile();
    writeFile();
    readFile();
    }

    public static void createFile(){
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\ogrenciler.txt");

        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu: "+file.getName());
            }else {
                System.out.println("Dosya zaten mevcuttur: "+file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(){
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\ogrenciler.txt");
        System.out.println("Dosya okunuyor: ");
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

    public static void writeFile(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir öğrenci ismi giriniz");
        String ogrenciAd=scanner.nextLine();

        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\ogrenciler.txt",true));
            bufferedWriter.newLine();
            bufferedWriter.write(ogrenciAd);
            System.out.println("Bilgiler dosyaya yazıldı");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
