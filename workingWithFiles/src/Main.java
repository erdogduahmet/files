import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\students.txt");

        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }
            else {
                System.out.println("Dosya zaten mevcut");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı: "+file.getName());
            System.out.println("Dosya yolu: "+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi: "+file.canWrite());
            System.out.println("Dosya okunabilir mi: "+file.canRead());
            System.out.println("Dosya boyutu (byte): "+file.length());
        }
    }

    public static void readFile(){
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\students.txt");
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
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\students.txt",true));
            //bu sondaki, true parametesi ile eklenen apend özelliği dosya formatı dosyayı üzerine yazmak yerine,dosyayı ekleme formatında aç oluyo
            bufferedWriter.newLine();//burada yeni satır oluşturma özelliğini kullandık yani önce yeni satır oluşturduk sonra dosyaya eklemeyi yaptık
            bufferedWriter.write("Engin");
            System.out.println("Dosyaya yazıldı");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
