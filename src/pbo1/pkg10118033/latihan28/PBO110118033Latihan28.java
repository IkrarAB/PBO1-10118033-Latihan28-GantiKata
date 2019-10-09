
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk mengganti kata dalam
 * sebuah kalimat
 *  
 */

package pbo1.pkg10118033.latihan28;

import java.util.Scanner;

public class PBO110118033Latihan28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Mengganti Kata=====\n");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String ganti = scanner.next();
        System.out.print("Menjadi Kata : ");
        String jadi = scanner.next();
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Kalimat Awal  : "+kalimat);
        System.out.println("Kalimat Akhir : "+kalimat.replaceAll(ganti, jadi));
        System.out.println("(Developed By : Ikrar AB)");
    }
}