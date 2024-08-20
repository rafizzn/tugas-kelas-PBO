/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mhs;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    private boolean mhs;
   
    void membaca(){
        if(!mhs){
            System.out.println("Mahasiswa sedang membaca");
        }else{
            System.out.println("Mahasiswa sedang tidak membaca");
        }
    }
    void nyontek(){
        if(mhs){
            System.out.println("Mahasiswa menyontek temannya");
        }else{
            System.out.println("Mahasiswa mengerjakan dengan jujur");
        }
    }
    void modifikasi(){
        if(mhs){
            System.out.println("Mahasiswa boleh memodifikasi");
        }else{
            System.out.println("Mahasiswa tidak boleh memodifikasi");
        }
    }
}
