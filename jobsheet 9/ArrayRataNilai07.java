import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jmlhMhs = sc.nextInt();
        int nilaiMhs[] = new int[jmlhMhs];
        int jmlMhsLulus = 0;
        int mhsTdklulus = 0;
        int totalLulus = 0;
        int totalTdklulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlMhsLulus++;
            } else {
                totalTdklulus += nilaiMhs[i];
                mhsTdklulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus: " + jmlMhsLulus);
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                System.out.println("mahasiswa ke-" + (i + 1) + " Lulus");
            }
        }

    }
}
