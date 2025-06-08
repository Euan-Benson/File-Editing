import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            File file = new File("example.txt");
            FileWriter Writer = new FileWriter("example.txt");

            if (file.createNewFile()) {
                System.out.println("File successfully created.");



                // Writing File
                Writer.write("Files in Java are seriously good!!");
                Writer.close();

                System.out.println("Successfully written.");
            } else {
                System.out.println("File already exists.");

                Writer.write("This file has already been written to");
                Writer.close();
            }
        } catch (IOException e) {
            System.err.println("An error has occurred.");
        }
    }
}
