import java.util.ArrayList;

//(letter + key) % 26,31
public class Cipher {
//    private String word;
//    public Cipher(String word) {
//        this.word = word;
//    }
//    public Cipher() {
//        this.word = "";
//    }

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz.,!? ";
    public static String encrypt(String inputStr,int shiftKey){// (hello. , 3)
        // convert inputStr into lower case
        inputStr = inputStr.toLowerCase();

        // encryptStr to store encrypted data
        String encryptStr = "";

        Validator validator = new Validator();
        if(validator.isValidKey(shiftKey)) {
            // use for loop for traversing each character of the input string
            for (int i = 0; i < inputStr.length(); i++) {
                // get position of each character of inputStr in ALPHABET
                int pos = ALPHABET.indexOf(inputStr.charAt(i));

                // get encrypted char for each char of inputStr
                int encryptPos = (shiftKey + pos) % 31;
                char encryptChar = ALPHABET.charAt(encryptPos);

                // add encrypted char to encrypted string
                encryptStr += encryptChar;
            }
            // return encrypted string
            return encryptStr;
        }
        return "wrong key entered.";
    }

    // create decryptData() method for decrypting user input string with given shift key
    public static String decrypt(String inputStr, int shiftKey)
    {
        // convert inputStr into lower case
        inputStr = inputStr.toLowerCase();

        // decryptStr to store decrypted data
        String decryptStr = "";

        Validator validator = new Validator();
        if(validator.isValidKey(shiftKey)) {
            // use for loop for traversing each character of the input string
            for (int i = 0; i < inputStr.length(); i++) {

                // get position of each character of inputStr in ALPHABET
                int pos = ALPHABET.indexOf(inputStr.charAt(i));

                // get decrypted char for each char of inputStr
                int decryptPos = (pos - shiftKey) % 31;

                // if decryptPos is negative
                if (decryptPos < 0) {
                    decryptPos = ALPHABET.length() + decryptPos;
                }
                char decryptChar = ALPHABET.charAt(decryptPos);

                // add decrypted char to decrypted string
                decryptStr += decryptChar;
            }
            // return decrypted string
            return decryptStr;
        }
        return "wrong key entered.";
    }
}
