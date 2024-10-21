
public class coba {

    public static void main(String[] args) {
        // char a = 'A';
        // char b = 'B';
        // char c = (char) (a | b);
        // char d = (char) (c & b);

        // System.out.println(c);
        // System.out.println(d);
        // char a = 's';
        // char b = '2';
        // char c = (char) (a >> 3);
        // char d = (char) (c & b);
        // System.out.println((char)c << 3);
        // char a = 's';
        // char b = '2';
        // char c = (char) (b % 256);
        // System.out.println(c);
        
        char a = 'A';
        int key = 123;

        char hasilEncrypt = (char) (((a ^ (key % 255)) | (key & 255)) << 1);
        System.out.println("Hasil enkripsi: " + hasilEncrypt);

        char hasilDecrypt = (char) (((hasilEncrypt >> 1) & (key | 255)) ^ (key % 255));
        System.out.println("Hasil dekripsi: " + hasilDecrypt);

    }
}
