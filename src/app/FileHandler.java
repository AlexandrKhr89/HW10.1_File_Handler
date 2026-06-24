package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "files/";

    public String writeFile(String fileContent) {
        try(FileWriter fw = fileName + ".txt") {
            fw(fileContent);
            return "Success.";
        } catch (Exception e) {
            return
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader()) {
            int sym;
            new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
