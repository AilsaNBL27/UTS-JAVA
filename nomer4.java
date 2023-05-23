
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C-13
 */
public class nomer4 {
    public static void main(String[] args) throws Exception {
      PrintWriter fileout = new PrintWriter("data.txt");
        fileout.println("Nilai Array ke - 0:5, Nilai Array ke - 1:10, Nilai Array ke - 2:15,Nilai Array ke - 3:20,Nilai Array ke - 4:25,Nilai Array ke - 5:30,"
                + "Nilai Array ke - 6:35,Nilai Array ke - 7:40,Nilai Array ke - 8:45,Nilai Array ke - 9:50");
        fileout.println("nama teman ke-1:Angel,nama teman ke-2:Sarah,nama teman ke-3:Wildan,nama teman ke-4:Ridho,nama teman ke-5:Farhan");
        fileout.println("Nama: Ailsa Nabila, NIM: 22201256, Alamat: Batu, Umur: 18, Tinggi Badan: 158.0 cm" );
        fileout.close();
    }
}
    

