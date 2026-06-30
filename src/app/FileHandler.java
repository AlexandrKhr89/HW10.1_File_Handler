package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandler {

    private static final Logger logger = Logger.getLogger(FileHandler.class.getName());

    public void writeFile(String path, String fileContent) {
        if (path == null || path.isEmpty()) {
            throw new IllegalArgumentException("Oops... FileHandler can`t write file. Path is null or empty.");
        }
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(fileContent);
            System.out.println("Success.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to write file at: {0} — {1}", new Object[]{path, e.getMessage()});
            throw new FileProcessingException(String.format("Failed to write file at: %s", path), e);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            System.out.print(stringBuilder.toString());
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to read file at: {0} — {1}", new Object[]{path, e.getMessage()});
            throw new FileProcessingException(String.format("Failed to read file at: %s", path), e);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
