
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M E G A S T A R
 */
public class ConverVocal2Angka {
    // tampilJudul
    
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal ke Angka)\n");
    }
    
    public static void main(String[] args)
    {
        String identitas = "Muhammad Khoirul Anam / XRPL3 / 25";
        
        tampilJudul(identitas);
        
        String kalimat = tampilInput();
        String convert = vocal2Angka(kalimat);
        tampilPerKata(kalimat, convert);
        tampilHasil(convert);
    }
    
    
        
        
    }
    

   
    

    
    
        
        
        


    
    
    

