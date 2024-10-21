
public class Encrypt {

    char[] arrEncrypt;
    StringBuilder encrypted;
    int key = 0;

    public Encrypt(String str, int key) {
        arrEncrypt = str.toCharArray();
        this.key = key;
        encrypted = new StringBuilder();
    }

    public void encryptData() {
        int length = arrEncrypt.length;

        for (int i = 0; i < length; i++) {
            key += i;
            char hasil = (char) (arrEncrypt[i] ^ (key % 255));

            arrEncrypt[i] = hasil;
        }
    }

    public String getEncryptedData() {
        for (int i = 0; i < arrEncrypt.length; i++) {
            encrypted.append((char) arrEncrypt[i]);
        }
        return encrypted.toString();

    }
}
