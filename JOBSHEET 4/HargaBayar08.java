import java.util.Scanner;

public class HargaBayar08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jumlahHalamanBuku;
        String merkBuku;
        double disc, total, bayar, jmlDis;
        System.out.println("Masukkan merk buku: ");
        merkBuku = input.nextLine();
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.println("Masukkan jumlah halaman buku: ");
        jumlahHalamanBuku = input.nextInt();
        System.out.println("Masukkan diskon: ");
        disc = input.nextDouble();
        total = harga * jumlah;
        jmlDis = total * disc;
        bayar = total - jmlDis;
        System.out.println("Diskon yang anda dapat" + jmlDis);
        System.out.println("Jumlah yang harus anda bayar" + bayar);
    }
}