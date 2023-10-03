import java.util.Scanner;
public class Pemilihan2Percobaan207 {
 public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);
    float sudut1, sudut2, sudut3, totalSudut;
    System.out.println("Masukkan sudut1: ");
    sudut1 = input07.nextFloat();
    System.out.println("Masukkan sudut 2: ");
    sudut2 = input07.nextFloat();
    System.out.println("Masukkan sudut 3: ");
    sudut3 = input07.nextFloat();
    totalSudut = sudut1 + sudut2 + sudut3;
    if (totalSudut == 180) {
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        }else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)){
            System.out.println("Segitiga tersebut adalah sama sisi");
        }else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1)){
            System.out.println("Segitiga sama kaki");
        } else{
            System.out.println("segitiga Sembarang");
        }
    } else 
    System.out.println("Bukan Segitiga"); 
 }
}
