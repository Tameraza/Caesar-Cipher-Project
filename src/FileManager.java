import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class FileManager {
        public String readFile(String filePath) {
            Path path = Path.of(filePath);
            try {
                return Files.readString(path);
            }catch (IOException e){
                System.out.println("error in line 10 in fileManager");
            }
            return "error,something went wrong with the readFile method in FileManager Class.";
        }
        public static void writeFile(String content, String filePath) {
            // Logic for writing a file
            Path path = Path.of(filePath);
            try{
                Files.createFile(path);
                Files.writeString(path,content);
            }catch (IOException e){
                System.out.println(Arrays.toString(e.getStackTrace()));
            }

        }
}
