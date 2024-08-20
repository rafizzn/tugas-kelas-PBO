/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mtk;

/**
 *
 * @author USER
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika mtk = new Matematika();
        
        int hasilPertambahan = mtk.pertambahan(20, 20);
        int hasilPengurangan = mtk.pengurangan(10, 5);
        int hasilPerkalian = mtk.perkalian(10, 20);
        int hasilPembagian = mtk.pembagian(21, 2);
        
        System.out.println("Pertambahan 20 + 20 = " +hasilPertambahan);
        System.out.println("Pengurangan 10 - 5 = " +hasilPengurangan);
        System.out.println("Perkalian 10 x 20 = " +hasilPerkalian);
        System.out.println("Pembagian 21 / 2 = " +hasilPembagian);
    }
}
