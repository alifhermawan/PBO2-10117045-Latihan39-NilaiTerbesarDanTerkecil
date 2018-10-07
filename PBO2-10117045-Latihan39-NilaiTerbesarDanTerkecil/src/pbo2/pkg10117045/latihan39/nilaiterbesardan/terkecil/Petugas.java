/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan39.nilaiterbesardan.terkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Alif Hermawan
 * KELAS    : PBO2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan nilai 
 * terbesar dan nilai terkecil sesuai nilai yang diinpukan oleh petugas
 *
 */
public class Petugas {
    public String namaPetugas;
    Nilai dafNilai = new Nilai();
    Scanner scn = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.next();
    }
    /*public void inputNilai() {
        int i = 0;
        for (int i=0; i<dafNilai.jumlahMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
        }
    }*/
}