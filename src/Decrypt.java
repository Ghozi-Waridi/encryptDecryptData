
public class Decrypt {

    char[] arrDecrypt;
    StringBuilder decrypted;
    int key = 0;

    public Decrypt(String str, int key) {
        arrDecrypt = str.toCharArray();
        this.key = key;
        decrypted = new StringBuilder();
    }

    public void decryptData() {

        for (int i = 0; i < arrDecrypt.length; i++) {
            key += i;

            char hasil = (char) (arrDecrypt[i] ^ (key % 255));
            
            arrDecrypt[i] = hasil;
        }
    }

    public String getDecryptedData() {
        for (int i = 0; i < arrDecrypt.length; i++) {
            decrypted.append((char) arrDecrypt[i]);
        }
        return decrypted.toString();

    }
}
