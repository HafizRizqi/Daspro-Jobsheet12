import java.util.Scanner;
public class PenjumlahanRekursif11 {

    public static int hitungPenjumlahan(int n) {
        if (n == 1) { 
            return (1);
        } else {
            return n + (hitungPenjumlahan(n - 1)); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        int hasil = hitungPenjumlahan(f);

        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " adalah: " + hasil);
    }
}