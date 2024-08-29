import java.io.IOException;
import java.nio.file.*;

public class FileManager {
        public static String readFile(String filePath) {
            Path path = Path.of(filePath);
            try {
                return Files.readString(path);
            }catch (IOException e){
                System.out.println("error");
            }
            return "error,something went wrong with the readFile method in FileManager Class.";
        }
        public void writeFile(String content, String filePath) {
            // Logic for writing a file
            Path path = Path.of(filePath);
            try{
                Files.createFile(path);
                Files.writeString(path,content);
            }catch (IOException e){
                System.out.println(e.getStackTrace());
            }

        }
}
