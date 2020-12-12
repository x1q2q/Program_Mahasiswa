/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmahasiswa;

/**
 *
 * @author rafikbojes
 */

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Mahasiswa {
    String nim;
    String nama;
    Date tglLahir;
    int gender;
    
    Mahasiswa(){} // skip error 
    Mahasiswa(String nimMhs, String namaMhs, String tgl, int genderMhs){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        try {  
            Date date = formatter.parse("31/03/2015");  
            this.tglLahir = formatter.parse(tgl);
        } catch (ParseException e) {} 
        
        this.nim = nimMhs;
        this.nama = namaMhs;
        this.gender = genderMhs;
    }
    
    void tampil(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, yyyy");
        String jenkel = this.gender==0?"Laki-laki":"Perempuan";
        String tanggal = formatter.format(this.tglLahir);
        System.out.println("NIM             : "+this.nim);
        System.out.println("NAMA            : "+this.nama);
        System.out.println("TANGGAL LAHIR   : "+tanggal);
        System.out.println("JENIS KELAMIN   : "+jenkel);
        System.out.println("");
    }
     void menuHead(){
        System.out.println("••••••••••••••••••••••••••••");
        System.out.println("      Program Mahasiswa    ");
        System.out.println("••••••••••••••••••••••••••••\n");
    }
    int menuUtama(){
        Scanner input = new Scanner(System.in);
        this.menuHead();
        System.out.println("\nMenu: ");
        System.out.println("1. Tampil Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Keluar\n");
        System.out.print("Pilih no menu: ");
        return input.nextInt();
    }
    boolean confirmExit(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nLanjut ke menu utama? (y/n) :");
        return "y".equals(input.nextLine());
    }
}
// Arafik NF
