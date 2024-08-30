import java.util.Locale;

public class BruteForce {
    public static String decryptByBruteForce(String encryptedText, String alphabet) {
        // Brute force logic
        encryptedText = encryptedText.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < alphabet.length(); i++){
            String s = "key: " + i + ", " + Cipher.decrypt(encryptedText,i) + "\n";
            stringBuilder.append(s);
        }
        return String.valueOf(stringBuilder);
        //FileManager.writeFile(String.valueOf(stringBuilder),"C:\\Users\\TAMER\\IdeaProjects\\firstProjectCodeGymCeaserCipher\\src\\BruteForceDecrypted.txt");
    }
}
