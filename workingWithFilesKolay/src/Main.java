import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dosya ismi giriniz");
        Scanner scanner=new Scanner(System.in);
        String dosyaIsmi=scanner.nextLine();
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\"+dosyaIsmi+".txt");

        if (file.exists()){
            System.out.println("Dosya mevcuttur: "+file.getName());
        }
        else {
            fileCreate(dosyaIsmi);
            System.out.println("Dosya oluşturuldu: "+file.getName());

        }

    }

    public static void fileCreate(String dosyaIsmi){
        File file=new File("C:\\Users\\20Erd\\OneDrive\\Masaüstü\\javaFinal\\files\\"+dosyaIsmi+".txt");

        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");

            }else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
