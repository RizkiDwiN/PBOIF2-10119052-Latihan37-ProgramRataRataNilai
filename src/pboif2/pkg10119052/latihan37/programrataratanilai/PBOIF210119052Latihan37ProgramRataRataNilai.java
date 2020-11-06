package pboif2.pkg10119052.latihan37.programrataratanilai;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program rata rata nilai mahasiswa
 * 
 */
public class PBOIF210119052Latihan37ProgramRataRataNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa.setMahasiswa(scanner.nextInt());
        
        for(int i = 1; i<= mahasiswa.getMahasiswa(); i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " +
                mahasiswa.rataRata());
        System.out.println("Developed by : Rizki Dwi Nugraha");
    }
    
}
