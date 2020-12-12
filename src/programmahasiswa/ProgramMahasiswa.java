/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmahasiswa;

import java.util.Scanner;

/**
 *
 * @author rafikbojes
 */

public class ProgramMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean check = true;
        Mahasiswa mhs = new Mahasiswa();
        DataMahasiswa dt = new DataMahasiswa();
        dt.addMhs(new Mahasiswa("K3519015","Arafik","10/01/2001",0));
        dt.addMhs(new Mahasiswa("K3519036","Royan","10/12/1999",0));
        dt.addMhs(new Mahasiswa("B3519023","Hana","21/11/1999",1));
        
        while(check){
            int menu = mhs.menuUtama();
            if(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5){
                switch(menu){
                    case 1:
                        // mhs tampildata
                        dt.showMhs();
                        check = mhs.confirmExit();
                        break; 
                        
                    case 2:
                        // mhs tambahdata
                        System.out.print("NIM                       : ");
                        String nim = input.nextLine();

                        System.out.print("NAMA                      : ");
                        String nama = input.nextLine();

                        System.out.print("TANGGAL LAHIR\n(tgl/bln/thn)             : ");
                        String tgl = input.nextLine();

                        System.out.println("JENIS KELAMIN"); 
                        System.out.print("(0)laki-laki;(1)perempuan : ");
                        int jk = input.nextInt();
                        
                        dt.addMhs(new Mahasiswa(nim, nama, tgl, jk));
                        check = mhs.confirmExit();
                        break;
                        
                    case 3:
                        // mhs caridata
                        System.out.print("Cari berdasarkan \n(1)Gender;(2)NIM : ");
                        int keyFil = input.nextInt();
                        Scanner inp = new Scanner(System.in);
                        if(keyFil == 1){
                            System.out.print("input GENDER dicari ");
                            System.out.print("(0)laki-laki;(1)perempuan : ");
                            int cariJk = inp.nextInt();
                            dt.searchMhs(""+cariJk+"", 1);
                        }else if(keyFil == 2){
                            System.out.print("input NIM dicari : ");
                            String cariNim = inp.nextLine();
                            dt.searchMhs(cariNim, 2);
                        }
                        
                        check = mhs.confirmExit();
                        break; 
                        
                    case 4:
                        Scanner inputDel = new Scanner(System.in);
                        // mhs hapusdata
                        dt.showMhs();
                        System.out.print("\n input NIM dihapus :");
                        String nimDel = inputDel.nextLine();
                        dt.delMhs(nimDel);
                        check = mhs.confirmExit();
                        break;
                        
                    default:
                        check=false;
                        break;
                }
            }else{
                check=true;
            }
        }
    }
   
}
// Arafik NF