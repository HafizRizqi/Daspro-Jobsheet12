import java.util.Scanner;

public class MarmutFibonacci11 {

    public static int hitungFibonacci(int bulan) {
        if (bulan == 1 || bulan == 2) { 
            return (1);
        } else {
            return (hitungFibonacci(bulan - 1) + hitungFibonacci(bulan - 2)); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bulan ke-: ");
        int bulan = scanner.nextInt();

        int totalPasangan = hitungFibonacci(bulan);

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + totalPasangan);

    }
}
