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
import java.util.ArrayList;
public class DataMahasiswa {
    ArrayList<Mahasiswa> dataMhs = new ArrayList<Mahasiswa>();
    void addMhs(Mahasiswa data){
        this.dataMhs.add(data);
    }
    void showMhs(){
        System.out.println("----------------------------");
        this.dataMhs.forEach((item) -> {
            item.tampil();
        });
        System.out.println("Jumlah data mahasiswa ("+this.dataMhs.size()+")");
    }
    void delMhs(String nimMhs){
        this.dataMhs.removeIf(item->item.nim.equals(nimMhs));
    }
    void searchMhs(String kode, int param){
        boolean find = false;
        int ind = -1;
        if(param == 1){ // berdasarkan gender
            for(int i=0; i<this.dataMhs.size(); i++){
                if(this.dataMhs.get(i).gender == Integer.parseInt(kode)){
                    ind = i;
                    find=true;
                }
            }
        }else{ // berdasarkan nim
            for(int j=0; j<this.dataMhs.size(); j++){
                if(this.dataMhs.get(j).nim.equals(kode)){
                    ind = j;
                    find=true;
                }
            }
        }
        if(find==true){
            System.out.println("Hasil pencarian: ");    
            this.dataMhs.get(ind).tampil();
        }else{
            System.out.println("Data mahasiswa tidak ditemukan");
        }
    }
    
}
// Arafik NF