import java.io.*;

public class Pra_36 {
    public static void main(String[] args) {
        String path = "D:/Desktop/JS"; // Replace with the path to the directory you want to list
        
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("File name: " + file.getName());
                System.out.println("Size: " + file.length() + " bytes");
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Executable: " + file.canExecute());
                System.out.println("Hidden: " + file.isHidden());
                System.out.println();
            }
        }
    }
}

/*
Output:
File name: Game.html
Size: 729 bytes
Readable: true
Writable: true
Executable: true
Hidden: false
File name: Main.js
Size: 1910 bytes
Readable: true
Writable: true
Executable: true
Hidden: false
*/
