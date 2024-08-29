import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {
    public boolean isValidKey(int key) {// ,char[] alphabet
        // Key check
        return key >= 0 && key <= 31;
    }
    public boolean isFileExists(String filePath) throws FileNotFoundException {
        // Check if the file exists
        Path path = Path.of(filePath);
        if(!Files.exists(path)){
            throw new FileNotFoundException();
        }
        else
            return true;
    }
}
