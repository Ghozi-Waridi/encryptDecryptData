
import java.util.Scanner;


public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Masukkan data yang akan disandikan:");
        // String data = scanner.nextLine();
        
        // System.out.println("Masukkan kunci (integer):");
        // int key = scanner.nextInt();

        

        // String data = "Ghozi Waridi";
        String data = "Ghozi Waridi123";
        // String data = "Ghozi Waridi123[]`~!@#$%^&*()_+";
        //  String data = "سلام Ghozi abc 123 हिंदी";

        int key = 123;
        
        Encrypt encrypt = new Encrypt(data, key);
        encrypt.encryptData();
        String hasil = encrypt.getEncryptedData();
        System.out.println("Data Encrypt : " + hasil);
        
        Decrypt decrypt = new Decrypt(hasil, key);
        decrypt.decryptData();
        String hasil2 = decrypt.getDecryptedData();
        System.out.println("Data Decrypt : " + hasil2);
    }
}
