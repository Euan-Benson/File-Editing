import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            // file should be in if statement if the first condition is to be met
            File file = new File("example.txt");
            FileWriter writer = new FileWriter(file, true);

            if (file.createNewFile()) {
                System.out.println("File successfully created.");

                // Writing File
                writer.write("Files in Java are seriously good!!" + "\n");
                writer.close();

                System.out.println("Successfully written.");
            } else {
                System.out.println("File already exists.");

                writer.append("This file has been written to" + "\n");
                writer.close();

                // alternate method to write to file using BufferWriter
//                BufferedWriter bw = new BufferedWriter(writer);
//                bw.write("This file has already been written to");
//                bw.newLine();
//                bw.close();
            }

            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();

        } catch (IOException e) {
            System.err.println("An error has occurred.");
        }
    }
}
