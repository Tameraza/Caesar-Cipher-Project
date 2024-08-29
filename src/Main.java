import java.io.IOException;
//"hi there,. how are you!?",
public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        String s = FileManager.readFile("C:\\Users\\TAMER\\IdeaProjects\\firstProjectCodeGymCeaserCipher\\src\\hi.txt");
        Cipher.encrypt(s,3);
        fileManager.writeFile(Cipher.encrypt(s,3),"C:\\Users\\TAMER\\IdeaProjects\\firstProjectCodeGymCeaserCipher\\src\\newFile.txt");
        String s2 = FileManager.readFile("C:\\Users\\TAMER\\IdeaProjects\\firstProjectCodeGymCeaserCipher\\src\\newFile.txt");
        System.out.println(Cipher.decryptData(s2,3));
    }
}