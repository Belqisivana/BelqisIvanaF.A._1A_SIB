import java.util.Scanner;
public class PemilihanPercobaan107 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input07.nextInt();
        // if (angka % 2 == 0)
        //     System.out.println("Angka " +angka+ " adalah bilangan genap");
        // else 
        // System.out.println("Angka " +angka+ " adalah bilangan ganjil");
        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganji";
        System.out.println("Angka " + angka + " adalah " + hasil);

    }
}