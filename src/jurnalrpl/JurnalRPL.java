/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalrpl;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JurnalRPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean ulang = true;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print("Input Jumlah Deret nya : ");
            int deret = scan.nextInt();

            long angka[] = new long[deret];
            angka[0] = 1;
            angka[1] = 1;

            for(int i = 2; i < deret; i++) {
                angka[i] = angka[i-1] + angka[i-2];
            }

            for (int i = 0; i < deret; i++) {
                System.out.print(angka[i] +  " ");
            }
            System.out.println();
            
            if(deret ==7){
                ulang = false;
            }
        }while(ulang == true);
    
    }
}
