
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C-13
 */
public class DataDiri {
  
    private String nama;
    private String nim;
    private String alamat;
    private int umur;
    private double tinggiBadan;
    
    public DataDiri(String nama, String nim, String alamat, int umur, double tinggiBadan) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNIM() {
        return nim;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public double getTinggiBadan() {
        return tinggiBadan;
    }
    
    public static void main(String[] args) {
        DataDiri dataDiri = new DataDiri("Ailsa Nabila Nirwasita", "22201256", "Kota Batu", 18, 158);
        
        System.out.println("Data Diri:");
        System.out.println("Nama: " + dataDiri.getNama());
        System.out.println("NIM: " + dataDiri.getNIM());
        System.out.println("Alamat: " + dataDiri.getAlamat());
        System.out.println("Umur: " + dataDiri.getUmur());
        System.out.println("Tinggi Badan: " + dataDiri.getTinggiBadan() + " cm");
    }
}
