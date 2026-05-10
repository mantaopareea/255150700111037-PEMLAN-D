import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {

        File folder = new File("D:\\COLLEGE\\PEMLAN\\Laprak\\MODUL10");

        if (folder.exists() && folder.isDirectory()) {

            File[] daftarFile = folder.listFiles();

            if (daftarFile != null) {

                for (File file : daftarFile) {
                    System.out.println(file.getName());
                }

            }

        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}

