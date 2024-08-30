import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("choose from the following menu by typing from 0 to 4:");
        System.out.println("""
                1. Encryption with key
                2. Decryption with key
                3. Brute force
                4. Statistical analysis
                0. Exit""");

        byte choice = console.nextByte();
        switch (choice) {
            case 0 -> System.out.println("exiting program.....");
            case 1 -> {
                FileManager fileManager = new FileManager();
                System.out.println("enter the path of the file you want to encrypt:");
                String path = console.next();
                System.out.println("enter the key:");
                byte key = console.nextByte();
                FileManager.writeFile(Cipher.encrypt(fileManager.readFile(path), key),"C:\\Users\\TAMER\\IdeaProjects\\firstProjectCodeGymCaesarCipher\\src\\encryptedFile.txt");
            }
            case 2 -> {
                FileManager fileManager = new FileManager();
                System.out.println("enter the path of the file you want to decrypt:");
                String path = console.next();
                System.out.println("enter the key:");
                byte key = console.nextByte();
                FileManager.writeFile(Cipher.decrypt(fileManager.readFile(path), key),"C:\\Users\\TAMER\\IdeaProjects\\firstProjectCodeGymCaesarCipher\\src\\decryptedFile.txt");
            }
            case 3 -> {
                FileManager fileManager = new FileManager();
                System.out.println("enter the path of the file you want to be bruteForced:");
                String path = console.next();
                System.out.println("enter the alphabet:");
                String alphabet = console.next();
                FileManager.writeFile(BruteForce.decryptByBruteForce(fileManager.readFile(path), alphabet),"C:\\Users\\TAMER\\IdeaProjects\\firstProjectCodeGymCaesarCipher\\src\\bruteForcedFile.txt");
            }
            case 4 -> System.out.println("still under maintenance....");

            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}