package word_frequency;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHelper {
    public static File initFile() {
        File textFile = new File("sample_text.txt");

        if (!textFile.exists()) {
            System.out.println("File doesn't exist");
        }

        return textFile;

    }

    public static void readFromFile(Structure data) {
        try (Scanner reader = new Scanner(initFile())) {
            while (reader.hasNext()){
                data.insert(reader.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}
