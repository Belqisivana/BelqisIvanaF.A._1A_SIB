import java.util.Scanner;

public class Gaji08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji, potGaji;
        System.out.println("Masukkan jumlah lama anda bekerja: ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah lama anda tidak bekerja: ");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan gaji: ");
        gaji = input.nextInt();
        System.out.println("Masukkan potongan gaji: ");
        potGaji = input.nextInt();
        totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima" + totGaji);

    }
}
