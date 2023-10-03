import java.util.Scanner;

public class PemilihanPercobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        float uts, uas, kuis, tugas, total;
        System.out.println("Nilai UAS    : ");
        uas = input07.nextFloat();
        System.out.println("Nilai UTS    : ");
        uts = input07.nextFloat();
        System.out.println("Nilai Kuis   : ");
        kuis = input07.nextFloat();
        System.out.println("Nilai tugas  : ");
        tugas = input07.nextFloat();
        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? " Remidi " : "Tidak remidi";
        System.out.printf("Nilai akhir %.2f sehingga %s\n", total, message);
        if (total > 80 && total <= 100) {
            System.out.println("Nilai angka A");
            System.out.println("Nilai setara 4");
            System.out.println("Kualifikasi:Sangat baik");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai angka B+");
            System.out.println("Nilai setara 3,5");
            System.out.println("Kualifikasi:Lebih dari baik");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai angka B");
            System.out.println("Nilai setara 3");
            System.out.println("Kualifikasi:Baik");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai angka C+");
            System.out.println("Nilai setara 2,5");
            System.out.println("Kualifikasi:Lebih dari cukup");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai angka C");
            System.out.println("Nilai setara 2");
            System.out.println("Kualifikasi:Cukup");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai angka D");
            System.out.println("Nilai setara 1");
            System.out.println("Kualifikasi:Kurang");
        } else if (total <= 39) {
            System.out.println("Nilai angka E");
            System.out.println("Nilai setara 0");
            System.out.println("Kualifikasi:Gagal");
        } else {
            System.out.println("Terjadi kesalahan");
        }
        // String message = total < 65 ? " Remidi " : "Tidak remidi";
        // System.out.println("Nilai akhir = " + total + " sehingga " + message);

    }
}
