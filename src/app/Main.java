package app;

public class Main {

    private final static String BASE_PATH = "files\\";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile";
        String fileContent = "My very important information.";
        getOutput("RESULT: ");
        try {
            handler.writeFile(BASE_PATH + fileName + ".txt", fileContent);
            getOutput("FILE CONTENT: ");
            handler.readFile(BASE_PATH + fileName + ".txt");
        } catch (IllegalArgumentException | FileProcessingException e ) {
            getOutput("IllegalArgumentException: " + e.getMessage() + "\n");
        }
    }

    private static void getOutput(String output) {
        System.out.print(output);
    }
}
