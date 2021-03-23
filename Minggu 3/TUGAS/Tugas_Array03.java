/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HP
 */
public class Tugas_Array03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] angka = {{1,3,5,7,9},{2,4,6,8,10},{1,3,7,11,13}};
        for (int baris = 0; baris < 3; baris++){
            for (int kolom = 0; kolom < 5; kolom++){
                System.out.print(angka[baris][kolom]+"   ");
            }
            System.out.println("");
        }
    }
    
}
