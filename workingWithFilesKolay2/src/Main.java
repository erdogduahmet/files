import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        fileCreate();
        checkFile();
    }

    public static void fileCreate(){
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\demo2.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }
            else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkFile(){
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\demo2.txt");
        if (file.exists()){
            System.out.println("Dosya adı: "+ file.getName());
            System.out.println("Dosya yolu: "+ file.getAbsolutePath());
            System.out.println("Dosyaya yazılabilir mi: "+ file.canWrite());
            System.out.println("Dosya okunabilir mi: "+ file.canRead());
            System.out.println("Dosya boyutu (byte): "+ file.length());
        }
    }
}
