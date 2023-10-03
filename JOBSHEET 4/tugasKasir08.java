import java.util.Scanner;
public class tugasKasir08{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int harga, jumlah;
        String nama ; 
        double bayar, total;
        System.out.println("Masukkan nama barang");
        nama= input.nextLine();
        System.out.println("Masukkan harga barang yang dibeli");
        harga= input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah= input.nextInt();
        total= harga*jumlah;
        bayar= total;
        System.out.println("Jumlah yang harus dibayarkan" + bayar);

    }
}