/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119052.latihan37.programrataratanilai;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program rata rata nilai mahasiswa
 * 
 */

public class Mahasiswa {
    public double nilai = 0;
    public int mahasiswa;

    public void setNilai(double nilai) {
        this.nilai = this.nilai + nilai;
    }

    public int getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(int mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    public double rataRata() {
        return nilai / mahasiswa;
    }
}
